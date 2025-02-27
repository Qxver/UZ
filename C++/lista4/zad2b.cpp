#include <iostream>
#include <cstdlib>
using namespace std;

class Punkt{
public:
    inline void punkt(char znak, int x, int y) {
        srand(time(nullptr));
        x = rand() % 100;
        y = rand() % 100;
        cout << znak << "(" << x << "," << y << ")" << endl;
    }

};

int main(){
    Punkt p1;
    p1.punkt('A',0,0);

    return 0;
}