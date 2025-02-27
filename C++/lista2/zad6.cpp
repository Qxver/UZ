#include <iostream>
using namespace std;

int dlugosc(char *n){

    int d = strlen(n);
    return d;
}

int main(void){
    char a[] = "tekst";
    int d = dlugosc(a);
    cout << d; 
}