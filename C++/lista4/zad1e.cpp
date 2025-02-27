#include <iostream>
using namespace std;

class Ulamek{
public:
    void ulamek(float licznik, float mianownik) {
        cout << "Wprowadz licznik: " << endl;
        cin >> licznik; cout << endl;
        if(licznik==0)  cout << "Bledna wartosc licznika" << endl;
        else    cout << "Ulamek: " << licznik << "/" << mianownik << endl;

    }

};

int main(){
    Ulamek u1;
    u1.ulamek(2, 3);
    return 0;
}