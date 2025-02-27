#include <iostream>
using namespace std;

class Ulamek{
public:
    Ulamek(float l, float m) {
        licznik = l;
        mianownik = m;
    }

    float licznik;
    float mianownik;
};

int main(){
    Ulamek u1(5, 4);
    cout << "Ulamek: "<< u1.licznik << "/" << u1.mianownik << endl;

    return 0;
}