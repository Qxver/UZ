#include <iostream>
#include <string.h>
using namespace std;

int main(void){
    char str[] = "Tekst";
    char search = 'k';

    if (strchr(str, search))
        cout << "Litera " << search << " znajduje sie w str" << endl;
    else
        cout << "Litera " << search << " nie znajduje sie w str" << endl;

    return 0;
}