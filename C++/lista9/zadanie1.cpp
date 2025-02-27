#include <iostream>
using namespace std;
class A {
public:
    virtual ~A() {}
    virtual char* nazwa()=0;
    friend char* nazwa1(A & refA){
        return refA.nazwa();
    }
};

class B : public A {
public:
    ~B() override {}
    char * nazwa() override { return "B"; }
};

class C : public B {
public:
    ~C() override {}
    char* nazwa() override { return "C"; }
};

void sprawdzDestruktory() {
    A* a = new C();
    delete a;
}

int main() {
    sprawdzDestruktory();
    C c;
    cout<<nazwa1(c)<<endl;
    return 0;
}

