#include "exercice.h"


int main() {
    char key[] = "ERIC";
    char message[] = "Abcdefghijklmnopqrstuvwxyz!!!";

    char encrypted[strlen(message)];
    cryptage_vigenere(message, encrypted, key);
    printf("The encrypted message is '%s'\n", encrypted);
    
    char decrypted[strlen(encrypted)];
    decryptage_vigenere(encrypted, decrypted, key);
    printf("The decrypted message is '%s'\n", decrypted);

    return 0;
}
