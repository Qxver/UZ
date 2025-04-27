class Osoba:
    def __init__(self, imie, nazwisko):
        self.imie = imie
        self.nazwisko = nazwisko


class Student(Osoba):
    def __init__(self, imie, nazwisko, nr_ind, oceny):
        super().__init__(imie, nazwisko)
        self.nr_ind = nr_ind
        self.oceny = oceny


class Pracownik(Osoba):
    def __init__(self, imie, nazwisko, stanowisko, wynagrodzenie):
        super().__init__(imie, nazwisko)
        self.stanowisko = stanowisko
        self.wynagrodzenie = wynagrodzenie


class PracujacyStudent(Student, Pracownik):
    def __init__(self, imie, nazwisko, nr_ind, oceny, stanowisko, wynagrodzenie):
        Student.__init__(self, imie, nazwisko, nr_ind, oceny)
        Pracownik.__init__(self, imie, nazwisko, stanowisko, wynagrodzenie)


WS = PracujacyStudent("Jan", "Kowalski", "102931", [3, 4, 5], "Wykladowca", 4000)