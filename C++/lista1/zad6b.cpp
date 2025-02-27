#include <iostream>
#include <string.h>
using namespace std;

int main(void){
    char ncel[] = "Programowanie";
    char nzrodlo[] = "Obiektowe";
    cout << ncel << endl;
    strcpy(ncel, nzrodlo);
    cout << ncel;

    return 0;
}