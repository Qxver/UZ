class Osoba:
    def __init__(self, id, wiek):
        self._id = id
        self.__wiek = wiek


osoba = Osoba(1, 20)
print(dir(osoba))