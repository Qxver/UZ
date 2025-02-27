#include <iostream>
using namespace std;
class Punkt{
public:
    int x;
    int y;

    Punkt(int x_coord, int y_coord){
        x = x_coord;
        y = y_coord;
    }

    void symetria(int sym_x, int sym_y){
        int x2 = sym_x - x;
        int y2 = sym_y - y;
        x = sym_x + x2;
        y = sym_y + y2;

        cout << "Punkt symetrii: B(" << sym_x << "," << sym_y << ")" << endl;
        cout << "Punkt po odbiciu: C(" << x << "," << y << ")" << endl;
    }

};

int main(){
    Punkt p1(-5, 3);
    cout << "Punkt przed odbiciem: " << "A(" << p1.x << "," << p1.y << ")" << endl;

    p1.symetria(0, 0);


    return 0;
}