#include <iostream>
#include <cstdlib>
using namespace std;

class Punkt{
public:
    int x;
    int y;
    Punkt(int x_coord, int y_coord) {
        x = x_coord;
        y = y_coord;
    }
};

int main(){
    srand(time(nullptr));
    Punkt p1(rand() % 100, rand() % 100);
    cout << "A" << "(" << p1.x << "," << p1.y << ")" << endl;
    return 0;
}