inw_plik = open('inw.txt', 'r')
inw = inw_plik.read()
result = []
upper = True
for char in inw:
    if char.isalpha():
        result.append(char.upper() if upper else char.lower())
        upper = not upper
    else:
        result.append(char)

co_2_litera_wielka = ''.join(result)
print(co_2_litera_wielka)