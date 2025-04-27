class Osoba:
    def __init__(self, imie, nazwisko):
        self.imie = imie
        self.nazwisko = nazwisko


    def przywitaj(self):
        print(f"Witaj, {self.imie} {self.nazwisko}")


osoba1 = Osoba("Marek", "Nowak")
print(type(osoba1))
print(type(osoba1.przywitaj()))
