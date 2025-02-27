#include <iostream>
using namespace std;

class Figura {
protected:
    int x, y;
public:
    Figura(int x = 0, int y = 0) : x(x), y(y) {}

    Figura& operator+=(const Figura& dodaj) {
        this->x += dodaj.x;
        this->y += dodaj.y;
        return *this;
    }

    virtual void rysuj() const {}
};

class Figura2D:public Figura {
public:
    using Figura::Figura;

    virtual void rysuj() const override = 0;
    virtual void przesun(int dx, int dy) = 0;
    virtual int pole() const = 0;
};

class Figura3D:public Figura {
public:
    using Figura::Figura;

    virtual void rysuj() const override = 0;
    virtual void przesun(int dx, int dy) = 0;
    virtual int pole() const = 0;
    virtual int objetosc() const = 0;
};

class Kwadrat:public Figura2D {
private:
    int bok;
public:
    Kwadrat(int x, int y, int bok) : Figura2D(x, y), bok(bok) {}

    void rysuj() const override {
        cout << "Rysuj kwadrat o boku " << bok << " na pozycji (" << x << ", " << y << ")\n";
    }

    void przesun(int dx, int dy) override {
        x += dx;
        y += dy;
    }

    int pole() const override {
        return bok * bok;
    }
};

class Prostokat:public Figura2D {
private:
    int bok1, bok2;
public:
    Prostokat(int x, int y, int bok1, int bok2) : Figura2D(x, y), bok1(bok1), bok2(bok2) {}

    void rysuj() const override {
        cout << "Rysuj prostokat o bokach " << bok1 << " i " << bok2 << " na pozycji (" << x << ", " << y << ")\n";
    }

    void przesun(int dx, int dy) override {
        x += dx;
        y += dy;
    }

    int pole() const override {
        return bok1 * bok2;
    }
};

class Szescian:public Figura3D {
private:
    int bok;
public:
    Szescian(int x, int y, int bok) : Figura3D(x, y), bok(bok) {}

    void rysuj() const override {
        cout << "Rysuj szescian o boku " << bok << " na pozycji ("<< x << ", " << y <<")\n";
    }

    void przesun(int dx, int dy) override {
        x += dx;
        y += dy;
    }

    int pole() const override {
        return 6 * bok * bok;
    }

    int objetosc() const override {
        return bok * bok * bok;
    }
};

class Prostopadloscian:public Figura3D{
private: int bok1, bok2, wysokosc;
public:
    Prostopadloscian(int x, int y, int bok1, int bok2, int wysokosc) : Figura3D(x, y), bok1(bok1), bok2(bok2), wysokosc(wysokosc) {}

    void rysuj() const override{
        cout << "Rysuj prostopadloscian o bokach podstawy " << bok1 << ", " << bok2 << " i wysokosci " << wysokosc << " na pozycji ("<< x << ", " << y <<")\n";
    }

    void przesun(int dx, int dy) override{
        x += dx;
        y += dy;
    }

    int pole() const override{
        return 2 * bok1 * bok2 + 2 * bok1 * wysokosc + 2 * bok2 * wysokosc;
    }

    int objetosc() const override{
        return bok1 * bok2 * wysokosc;
    }
};

int main() {
    Kwadrat k1(1, 2, 5);
    k1.rysuj();
    cout << "Pole kwadratu: " << k1.pole() << endl;
    k1.przesun(2, 3);
    k1.rysuj();

    cout << endl;

    Prostokat p1(3, 4, 2, 3);
    p1.rysuj();
    cout << "Pole prostokata: " << p1.pole() << endl;
    p1.przesun(2, 3);
    p1.rysuj();

    cout << endl;

    Szescian s1(3, 4, 2);
    s1.rysuj();
    cout << "Pole szescianu: " << s1.pole() << endl;
    cout << "Objetosc szescianu: " << s1.objetosc() << endl;
    s1.przesun(1, 1);
    s1.rysuj();

    cout << endl;

    Prostopadloscian p2(5, 6, 2, 3, 5);
    p2.rysuj();
    cout << "Pole prostopadloscianu: " << p2.pole() << endl;
    cout << "Objetosc prostopadloscianu: " << p2.objetosc() << endl;

    return 0;
}
