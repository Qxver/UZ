inw_plik = open('inw.txt', 'r')
inw = inw_plik.read()
wers_wielka = '\n'.join(line[:1].upper() + line[1:] if line else '' for line in inw.split('\n'))
print(wers_wielka)