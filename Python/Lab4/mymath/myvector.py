def dodaj(a, b):
    return [a + b for a, b in zip(a, b)]


def odejmij(a, b):
    return [a - b for a, b in zip(a, b)]


def pomnoz(a, b):
    return [a * b for a, b in zip(a, b)]