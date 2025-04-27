class Prostokat:
    def __init__(self, x, y, w, h):
        self.x = x
        self.y = y
        self.w = w
        self.h = h

class Okno:
    def __init__(self, nazwa, kolor, prostokat):
        self.nazwa = nazwa
        self.kolor = kolor
        self.prostokat = prostokat

okno1 = Okno("Okno", "zielony", Prostokat(1, 2, 100, 200))