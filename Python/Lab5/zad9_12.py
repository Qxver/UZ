nazwa = input("Podaj nazwe pliku: ")
with open(nazwa) as plik:
    print(plik.read())