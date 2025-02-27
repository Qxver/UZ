#include <iostream>
#include <vector>
using namespace std;

class Punkt {
public:
    int x, y, z;
    Punkt(int x = 0, int y = 0, int z = 0) : x(x), y(y), z(z) {}

    Punkt operator+(const Punkt& res) const {
        return Punkt(x + res.x, y + res.y, z + res.z);
    }

    Punkt operator-(const Punkt& res) const {
        return Punkt(x - res.x, y - res.y, z - res.z);
    }

    friend ostream& operator<<(ostream& os, const Punkt& punkt) {
        os << "(" << punkt.x << ", " << punkt.y << ", " << punkt.z << ")";
        return os;
    }
};

class Wektor {
private:
    vector<Punkt> punkty;
public:
    Wektor() {}

    void dodajPunkt(const Punkt& punkt) {
        punkty.push_back(punkt);
    }

    Wektor operator+(const Wektor& res) const {
        Wektor wynik;
        size_t minSize = min(punkty.size(), res.punkty.size());
        for (size_t i = 0; i < minSize; ++i) {
            wynik.dodajPunkt(punkty[i] + res.punkty[i]);
        }
        return wynik;
    }

    Wektor operator-(const Wektor& res) const {
        Wektor wynik;
        size_t minSize = min(punkty.size(), res.punkty.size());
        for (size_t i = 0; i < minSize; ++i) {
            wynik.dodajPunkt(punkty[i] - res.punkty[i]);
        }
        return wynik;
    }

    void wypisz() const {
        for (const auto& punkt : punkty) {
            cout << punkt << endl;
        }
    }
};

int main() {
    Punkt p1(1, 2, 3);
    Punkt p2(4, 5, 6);
    Punkt p3(7, 8, 9);
    Punkt p4(10, 11, 12);

    Wektor w1;
    w1.dodajPunkt(p1);
    w1.dodajPunkt(p2);

    Wektor w2;
    w2.dodajPunkt(p3);
    w2.dodajPunkt(p4);

    cout << "Wektor w1:" << endl;
    w1.wypisz();

    cout << "Wektor w2:" << endl;
    w2.wypisz();

    Wektor w3 = w1 + w2;
    cout << "Wektor w3 (w1 + w2):" << endl;
    w3.wypisz();

    Wektor w4 = w1 - w2;
    cout << "Wektor w4 (w1 - w2):" << endl;
    w4.wypisz();

    return 0;
}
