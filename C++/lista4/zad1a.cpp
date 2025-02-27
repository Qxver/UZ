#include <iostream>
using namespace std;

class Ulamek{
public:
    Ulamek() {
        licznik = 2;
        mianownik = 3;
    }

    int licznik;
    int mianownik;
};

int main(){
    Ulamek u1;
    cout << "Ulamek zwykly:" << u1.licznik << "/" << u1.mianownik;

    return 0;
}