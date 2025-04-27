dodaj = lambda a, b: a + b
odejmij = lambda a, b: a - b
pomnoz = lambda a, b: a * b
podziel = lambda a, b: a / b

x = dodaj(podziel(dodaj(4, pomnoz(2, odejmij(5, 10))), odejmij(pomnoz(32, 11), 4)), 2)
print(x)