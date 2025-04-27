nazwa = input("Podaj nazwe pliku: ")
try:
    with open(nazwa) as plik:
        wiersze = plik.readlines()
        wiersz = int(input("Podaj nr wiersza do wyswietlenia: "))
        if wiersz > len(wiersze):
                print("Nie znaleziono danego wiersza")
        else:
            print(f"Wiersz {wiersz}: {wiersze[wiersz - 1].rstrip()}")
except FileNotFoundError:
    print("Nie znaleziono pliku.")

