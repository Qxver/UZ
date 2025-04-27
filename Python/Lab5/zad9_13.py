nazwa = input("Podaj nazwe pliku: ")
try:
    with open(nazwa) as plik:
        print(plik.read())
except FileNotFoundError:
    print("Nie znaleziono pliku.")