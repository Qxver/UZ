def dodaj(a, b):
    if len(a) == len(b):
        return [a + b for a, b in zip(a, b)]


def odejmij(a, b):
    if len(a) == len(b):
        return [a - b for a, b in zip(a, b)]


def pomnoz(a, b):
    if len(a) == len(b):
        return [a * b for a, b in zip(a, b)]


list1 = [1, 2, 3]
list2 = [4, 5, 6]

print(dodaj(list1, list2))
print(odejmij(list1, list2))
print(pomnoz(list1, list2))
