import string

inw_plik = open('inw.txt', 'r')
inw = inw_plik.read()
tekst_z_format = inw.replace('a', '{}').replace('A', '{}')

ilosc_miejsc = tekst_z_format.count('{}')

litery = list(string.ascii_lowercase)
zamien = litery * ((ilosc_miejsc // len(litery)) + 1)
zamien = zamien[:ilosc_miejsc]

wynik = tekst_z_format.format(*zamien)

print(wynik)