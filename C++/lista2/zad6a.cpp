#include <iostream>
using namespace std;

int strlen(char *n){
    int length = 0;
    while(*n != '\0'){
        length++;
        n++;
    }
    return length;
}

int main(void){
    char n[] = "Uwielbiam jezyk C++";
    cout << "String length: " << strlen(n) << endl;
    return 0;
}
