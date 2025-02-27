#include <iostream>
using namespace std;

void zwiekszanie(int *a){

    *a+=2;
}

int main(void){
    int liczba = 3;
    int* a=&liczba;
    zwiekszanie(&liczba);
    cout << liczba;
}