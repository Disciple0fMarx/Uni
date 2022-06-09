#include <stm32f407xx.h>


void LD3_Init(void);
void LD3_On(void);
void LD3_Off(void);
void delay(unsigned Dt);

// static unsigned led = 0;


int main() {
	LD3_Init();
	while (1) {
		LD3_On();
		delay(1000000);
		LD3_Off();
		delay(500000);
	}
}


void LD3_Init() {
	RCC -> AHB1ENR |= 1 << 3;
	
	GPIOD -> MODER |= 1 << 26;
	GPIOD -> MODER &= (unsigned) ~(1 << 27);
	
	GPIOD -> OTYPER &= (unsigned) ~(1 << 13);
	
	GPIOD -> OSPEEDR &= (unsigned) ~(1 << 26);
	GPIOD -> OSPEEDR |= 1 << 27;
	
	GPIOD -> PUPDR &= (unsigned) ~(1 << 26);
	GPIOD -> PUPDR |= 1 << 27;
}


void LD3_On() {
	GPIOD -> BSRR = 1 << 13;
}


void LD3_Off() {
	GPIOD -> BSRR = 1 << 29;
}


void delay(unsigned Dt) {
	volatile unsigned i;
	for (i = 0; i < Dt; i ++)
		__ASM("nop");
}
