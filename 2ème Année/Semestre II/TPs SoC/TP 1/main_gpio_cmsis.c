#include <stm32f4xx.h>
#include <Board_LED.h>

void delay(int Dt);


int main() {
	LED_Initialize();
	while (1) {
		uint32_t i;
		for (i = 0; i < 4; i ++) {
			LED_On(i);
			delay(1000000);
			LED_Off(i);
		}
	}
}


void delay(int Dt) {
	int i;
	for (i = 0; i < Dt; i ++){
		__ASM("nop");
	}
}
