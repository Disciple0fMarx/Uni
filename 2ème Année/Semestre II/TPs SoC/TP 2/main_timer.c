#include <stm32f4xx.h>

void LED1_Init(void);
void LED1_On(void);
void LED1_Off(void);

void TIM3_Initialize(void);
void NVIC_Initialize(void);
void TIM3_IRQHandler(void);

static unsigned int led = 0;


int main() {
	LED1_Init();
	TIM3_Initialize();
	NVIC_Initialize();
	while (1);
}


void LED1_Init() {
	RCC -> AHB1ENR |= 1 << 3;                  // Set bit 3 (Activate clock for port GPIOD)
	
	GPIOD -> MODER |= 1 << 24;                 // Set bit 24
	GPIOD -> MODER &= (unsigned) ~(1 << 25);   // Reset bit 25 (General Purpose Output Mode for PD12)
	
	GPIOD -> OTYPER &= (unsigned) ~(1 << 12);  // Reset bit 12 (Output Push-Pull for PD12)
	
	GPIOD -> OSPEEDR &= (unsigned) ~(1 << 24); // Reset bit 24
	GPIOD -> OSPEEDR |= 1 << 25;    		   // Set bit 25 (High Speed for PD12)
	
	GPIOD -> PUPDR &= (unsigned) ~(1 << 24);   // Reset bit 24
	GPIOD -> PUPDR |= 1 << 25;                 // Set bit 25 (Pull-Down for PD12)
}


void LED1_On() {
	GPIOD -> BSRR = 1 << 12;                   // Set bit 12 (Set PD12)
}


void LED1_Off() {
	GPIOD -> BSRR = 1 << 28;                   // Set bit 28 (Reset PD12)
}


void TIM3_Initialize() {
	RCC -> APB1ENR |= 1 << 1;
	TIM3 -> PSC = 799;   // 800 - 1
	TIM3 -> CR1 = 0;
	TIM3 -> ARR = 9999;  // 10000 - 1
	TIM3 -> DIER |= 1;
	TIM3 -> CR1 |= 1;
}


void NVIC_Initialize() {
	NVIC -> ISER[0] |= 1 << 29;
}


void TIM3_IRQHandler() {
	if (TIM3 -> SR & 1) {
		TIM3 -> SR &= (unsigned) ~1; 
		if (!led) {
			LED1_On();
			led = 1;
		} else {
			LED1_Off();
			led = 0;
		}
	}
}
