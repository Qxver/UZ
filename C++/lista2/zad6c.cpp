#include <iostream>
#include <string.h>
using namespace std;

int main(void){
    char str1[] = "String1";
    char str2[] = "String2";
    int a = strcmp(str1, str2);
    if(a==-1){
        a = 1;
    }
    cout << a;

    return 0;
}