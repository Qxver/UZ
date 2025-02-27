#include <iostream>
using namespace std;

template<typename T>
T suma(T a, T b) {
    return a + b;
}

class Zespolona {
private:
    double re, im;

public:
    Zespolona(double r = 0, double i = 0) : re(r), im(i) {}

    Zespolona operator+(Zespolona& zes) const {
        return {re + zes.re, im + zes.im};
    }

    friend ostream& operator<<(ostream& os, Zespolona& z) {
        os << "(" << z.re << ", " << z.im << ")";
        return os;
    }
};

int main(){
    cout << "Szablon suma: " << suma(3,7) << endl;
    Zespolona z1(2,5),z2(3,6);
    Zespolona wynik = z1+z2;
    cout << "Suma 2 zespolonych liczb: " <<wynik<<endl;

    return 0;
}