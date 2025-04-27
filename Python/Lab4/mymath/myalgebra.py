def dodaj(matrix1, matrix2):
    if len(matrix1) == len(matrix2):
        return [[a + b for a, b in zip(row1, row2)] for row1, row2 in zip(matrix1, matrix2)]


def odejmij(matrix1, matrix2):
    if len(matrix1) == len(matrix2):
        return [[a - b for a, b in zip(row1, row2)] for row1, row2 in zip(matrix1, matrix2)]


def pomnoz(matrix1, matrix2):
    if len(matrix1) == len(matrix2):
        return [[sum(a * b for a, b in zip(row, col)) for col in zip(*matrix2)] for row in matrix1]
