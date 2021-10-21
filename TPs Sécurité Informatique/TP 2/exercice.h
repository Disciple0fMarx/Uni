#include <stdio.h>
#include <string.h>


char decalage(char c, int k) {
    /* Décale le caractère 'c' par la valeur 'k'
     * (La fonction du TP 1)
     */
    char result;
    if (c >= 'A' && c <= 'Z') {
        result = (c - 'A' + k) % 26 + 'A';
    } else {
        if (c >= 'a' && c <= 'z') {
            result = (c - 'a' + k) % 26 + 'a';
        } else {
            result = c;
        }
    }
    return result;
}


void cryptage_vigenere(char *in, char *out, char *k) {
    /* Permet de crypter 'in' avec le clé 'k'
     * et renvoie le résultat en 'out'.
     */
}
