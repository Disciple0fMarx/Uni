#include <stm32f4xx.h>

void LED1_Init(void);
void LED1_On(void);
void LED1_Off(void);
void delay(int Dt);


int main() {
	LED1_Init();
	while (1) {
		LED1_On();
		delay(1000000);
		LED1_Off();
		delay(1000000);
	}
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


void delay(int Dt) {
	volatile int i;
	for (i = 0; i < Dt; i ++){
		__ASM("nop");
	}
}
