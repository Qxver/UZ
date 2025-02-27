#include <iostream>
using namespace std;

class Ulamek{
public:
    void ulamek(float licznik, float mianownik) {
       cout << "Ulamek: " << licznik << "/" << mianownik << endl;
    }

};

int main(){
    Ulamek u1;
    u1.ulamek(2, 3);

    return 0;
}