with open("plik.txt", "r") as file:
    wiersze = file.readlines()

tekst = []
for i, wiersz in enumerate(wiersze):
    wiersz = wiersz.rstrip("\n")
    if i % 2 == 0:
        tekst.append(wiersz + "!")
    else:
        tekst.append(wiersz + "?")


nazwa = input("Podaj nazwe pliku: ")

with open(nazwa, "w") as f:
    for i in tekst:
        f.write(i + "\n")