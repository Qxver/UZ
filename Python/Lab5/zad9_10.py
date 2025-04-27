imie = "Jan"
nazwisko = "Kowalski"
produkty = [("książka", 1, 199.99, 199.99), ("zeszyt", 2, 7.89, 15.78)]

powitanie = "Witaj {} {}!\n\n".format(imie, nazwisko)

tresc_zamowienia = "Dziękujemy za złożenie zamówienia w naszym sklepie. Oto szczegóły Twojego zamówienia:\n"
suma = 0

for i in produkty:
    nazwa, sztuki, cena, razem = i
    tresc_zamowienia += "{:<20} szt {:<2}    cena {:<10}    razem {:<10}\n".format(nazwa, sztuki, cena, razem)
    suma += razem

tresc_zamowienia += "\nSUMA: {:.2f} zł\n".format(suma)
pozdrowienia = "\nPozdrawiamy,\nZespół TwojFantastycznySklep"
wiadomosc = powitanie + tresc_zamowienia + pozdrowienia

print(wiadomosc)