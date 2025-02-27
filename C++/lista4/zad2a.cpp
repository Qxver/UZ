#include <iostream>
using namespace std;

class Punkt{
public:
   inline void punkt(char znak, int x, int y) {
        cout << "Wprowadz nazwe punktu: "  << endl;
        cin >> znak; cout << endl;
        cout << "Wprowadz wspolrzedna x: " << endl;
        cin >> x; cout << endl;
        cout << "Wprowadz wspolrzedna y: " << endl;
        cin >> y; cout << endl;

        cout << znak << "(" << x << "," << y << ")" << endl;
    }

};

int main(){
    Punkt p1;
    p1.punkt('A',0,0);

    return 0;
}