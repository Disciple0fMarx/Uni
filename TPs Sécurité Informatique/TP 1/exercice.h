#include <stdio.h>
#include <string.h>
#include <stdlib.h>


char decalage(char c, int k) {
    /* Décale le caractère 'c' par la valeur 'k' */
    char result;
    if (c >= 'A' && c <= 'Z') {
        result = (c - 'A' + k) % 26 + 65;
    } else {
        if (c >= 'a' && c <= 'z') {
            result = (c - 'a' + k) % 26 + 97;
        } else {
            result = c;
        }
    }
    return result;
}


void cryptage_cesar(char *in, char *out, int k) {
    /* Permet de crypter 'in' avec la valeur du clé 'k'
     * et renvoie le résultat en 'out'.
     */
    int i;
    for (i = 0; i < strlen(in); i ++)
        out[i] = decalage(in[i], k);
    out[strlen(in)] = '\0';
}


char soustraire(char c, int k) {
    /* La fonction inverse de 'char decalage(char c, int k)' */
    return decalage(c, -k);
}


void decryptage_cesar(char *in, char *out, int k) {                  // Méthode 1
    /* Permet de décrypter 'in' avec la valeur du clé 'k'
     * et renvoie le résultat en 'out'.
     * (C'est la fonction inverse de 
     * 'cryptage_cesar(char *in, char *out, int k)')
     */
    cryptage_cesar(in, out, -k);
}


// void decryptage_cesar(char *in, char *out, int k) {               // Méthode 2
//     int i;
//     for (i = 0; i < strlen(in); i ++)
//         out[i] = soustraire(in[i], k);
//     out[strlen(in)] = '\0';
// }


char lettre_frequente(char *ch) {
    /* Retourne la lettre la plus fréquente dans la chaine 'ch'. */
    int i, frequence[26];
    for (i = 0; i < 26; i ++) frequence[i] = 0;                      // Initialisation du tableau
    for (i = 0; i < strlen(ch); i ++) {
        if (ch[i] >= 'A' && ch[i] <= 'Z') frequence[ch[i] - 'A'] ++;
        if (ch[i] >= 'a' && ch[i] <= 'z') frequence[ch[i] - 'a'] ++;
    }
    char result = 'A';
    int max = frequence[0];
    for (i = 1; i < 26; i ++) {
        if (frequence[i] > max) {
            max = frequence[i];
            result = 'A' + i;
        }
    }
    return result;
}


int cryptoanalyse_cesar(char *in, char *out) {
    /* Retourne la valeur du clé de cryptage si elle est trouvée,
     * -1 sinon.
     */
    char options[] = "ESANTIRULO";
    char test[strlen(in) + 1];
    int i = 0, temp, found = 0;
    do {
        temp = abs(lettre_frequente(out) - options[i]);
        cryptage_cesar(in, test, temp);
        found = !strcmp(out, test);
        i ++;

    } while (!found && i < strlen(options));
    int result = found ? temp : -1;
    return result;
}
