#include <string.h>
#include <stdlib.h>
#include <ctype.h>


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


int map(char c) {
    if (c >= 'A' && c <= 'Z') return c - 'A';
    if (c >= 'a' && c <= 'z') return c - 'a';
    return 0;
}


void cryptage_vigenere(char *in, char *out, char *k) {
    /* Permet de crypter 'in' avec le clé 'k'
     * et renvoie le résultat en 'out'.
     */
    int i, j = 0;
    for (i = 0; i < strlen(in); i ++) {
        out[i] = decalage(in[i], map(k[j]));
        if (isalpha(in[i])) {
            j ++;
            j %= strlen(k);
        }
    }
    out[strlen(in)] = '\0';
}


char soustraire(char c, int k) {
    /* La fonction inverse de 'decalage(char c, int k)'. */
    char result;
    if (c >= 'A' && c <= 'Z') {
        result = (c - 'A' - k) % 26 + 'A';
    } else {
        if (c >= 'a' && c <= 'z') {
            result = (c - 'a' - k) % 26 + 'a';
        } else {
            result = c;
        }
    }
    return result;
}


void decryptage_vigenere(char *in, char *out, char *k) {
    /* Permet de décrypter 'in' avec le clé 'k'
     * et renvoie le résultat en 'out'.
     */
    int i, j = 0;
    for (i = 0; i < strlen(in); i ++) {
        out[i] = soustraire(in[i], map(k[j]));
        if (isalpha(in[i])) {
            j ++;
            j %= strlen(k);
        }
        out[strlen(in)] = '\0';
    }
}


char *cryptoanalyse_vigenere(char *in, char *out, int longueur) {
    /* Permet de déterminer la clé qui crypte 'in' en 'out'
     * s'il existe.
     */
    char *temp, *result;
    temp = (char *)malloc(longueur);
    result = (char *)malloc(longueur);
    int i = 0, j = 0;
    do {
        if (isalpha(in[i])) {
            temp[j] = in[i];
            j ++;
        }
        i ++;
    } while (i < longueur);
    temp[longueur] = '\0';
    for (i = 0; i < longueur; i ++) {
        int j = 0, found = 0;
        char aux;
        do {
            aux = decalage(temp[i], j);
            j ++;
            if (out[i] == aux) found = 1;
        } while (!found && j < 26);
        result[i] = j - 1 + 'A';
    }
    result[longueur] = '\0';
    char *output = result;
    return output;
}
