#include "exercice.h"


int main() {
    char key[] = "BC";
    char message[] = "Secret!!!";

    char *encrypted;
    encrypted = (char *)malloc(strlen(message));
    cryptage_vigenere(message, encrypted, key);
    printf("Le message crypte est '%s'\n", encrypted);
    
    char *decrypted;
    decrypted = (char *)malloc(strlen(encrypted));
    decryptage_vigenere(encrypted, decrypted, key);
    printf("Le message decrypte est '%s'\n", decrypted);

    char *keyGuess;
    keyGuess = (char *)malloc(strlen(key));
    printf(
        "La cle d'apres la cryptoanalyse est '%s'\n",
        cryptoanalyse_vigenere(message, encrypted, strlen(key))
    );

    return 0;
}
