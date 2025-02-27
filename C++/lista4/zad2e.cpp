#include <iostream>
using namespace std;

class Punkt{
public:
    int x;
    int y;
    Punkt(int x_coord, int y_coord) {
        x = x_coord;
        y = y_coord;
    }

    Punkt suma(Punkt &p) const{
        return {x+p.x, y+p.y};
    }

    void wynik() const{
        cout << "Suma punktow A i B: (" << x << "," << y << ")" << endl;
    }
};

int main(){
    Punkt p1(1, 1);
    Punkt p2(2, 3);

    Punkt suma = p1.suma(p2);
    cout << "A(" << p1.x << "," << p1.y << ")" << endl;
    cout << "B(" << p2.x << "," << p2.y << ")" << endl;
    suma.wynik();

    return 0;
}