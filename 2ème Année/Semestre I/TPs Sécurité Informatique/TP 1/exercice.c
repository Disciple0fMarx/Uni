#include "exercice.h"


int main() {
    char message[] = "Three letters forward.";
    char encrypted[strlen(message)];

    cryptage_cesar(message, encrypted, 3);
    printf("Le message crypte est '%s'.\n", encrypted);

    char decrypted[strlen(encrypted)];
    decryptage_cesar(encrypted, decrypted, 3);
    printf("Le message decrypte est '%s'.\n", decrypted);

    printf(
        "La lettre la plus frequente dans le message crypte est '%c'.\n",
        lettre_frequente(encrypted)
    );

    printf(
        "La valeur du cle d'apres le cryptoanalyse est %d.\n",
        cryptoanalyse_cesar(message, encrypted)
    );

    return 0;
}
