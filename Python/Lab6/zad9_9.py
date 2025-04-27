import math

class Punkt:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def wyswietl(self):
        print(f"Punkt znajduje sie w ({self.x}, {self.y})")


class Odcinek:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def dlugosc(self):
        dlugosc = math.sqrt((p1.x - p2.x) ** 2 + (p1.y - p2.y) ** 2)
        return dlugosc


class Trojkat:
    def __init__(self, p1, p2, p3):
        self.p1 = p1
        self.p2 = p2
        self.p3 = p3

    def obwod(self):
        a = Odcinek(self.p1, self.p2).dlugosc()
        b = Odcinek(self.p2, self.p3).dlugosc()
        c = Odcinek(self.p3, self.p1).dlugosc()
        obwod = a + b + c
        return obwod

    def pole(self):
        a = Odcinek(self.p1, self.p2).dlugosc()
        b = Odcinek(self.p2, self.p3).dlugosc()
        c = Odcinek(self.p3, self.p1).dlugosc()
        p = (a + b + c)/2
        pole = math.sqrt(p * (p - a) * (p - b) * (p - c))
        return pole

p1 = Punkt(1, 1)
p2 = Punkt(6, 1)
p3 = Punkt(3, 6)
odcinek = Odcinek(p1, p2).dlugosc()
obwod = Trojkat(p1, p2, p3).obwod()
pole = Trojkat(p1, p2, p3).pole()
Punkt.wyswietl(p1)
print(f"Dlugosc odcinka p1, p2: {odcinek}")
print(f"Obwod trojkata p1, p2, p3: {obwod}")
print(f"Pole trojkata p1, p2, p3: {pole}")