#include <iostream>
using namespace std;

class Elem{
public:
    int data;
    Elem *link;

    Elem *r = new Elem; *r.data=7;
    Elem *q = new Elem; *q.data=5;
    Elem *p = new Elem; *p.data=1; *p->link = q; q->link = r;
};



