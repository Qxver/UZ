from mymath import myalgebra
import importlib


def load_matrix():
    matrix = []

    while True:
        row = input("Podaj wiersz macierzy ('K' aby zakonczyc): ")
        if row == "K":
            break
        matrix.append([int(x) for x in row.split()])
    return matrix

while True:
    importlib.reload(myalgebra)

    print("Wybierz operację:")
    print("1 - Dodawanie macierzy")
    print("2 - Odejmowanie macierzy")
    print("3 - Mnożenie macierzy")
    print("K - Koniec")

    option = input()

    if option == 'K':
        break

    print("Podaj 1 macierz: ")
    matrix1 = load_matrix()
    print("Podaj 2 macierz: ")
    matrix2 = load_matrix()

    if option == '1':
        result = myalgebra.dodaj(matrix1, matrix2)
    elif option == '2':
        result = myalgebra.odejmij(matrix1, matrix2)

    elif option == '3':
        result = myalgebra.pomnoz(matrix1, matrix2)

    else:
        print("Nieprawidlowy wybor")
        continue

    if result:
        print("Wynik: ")
        for row in result:
            print(row)