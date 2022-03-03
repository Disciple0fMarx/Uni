#include <stm32f4xx.h>
#include <Board_LED.h>

void delay(int Dt);


int main() {
	LED_Initialize();
	while (1) {
		LED_On(4);
		delay(1000000);
		LED_Off(4);
		delay(1000000);
	}
}


void delay(int Dt) {
	volatile int i;
	for (i = 0; i < Dt; i ++){
		__ASM("nop");
	}
}
