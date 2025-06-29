import numpy as np


A = np.array([[1, 2], [3, 4], [5, 6], [7, 8]])
B = np.array([[2, 0, 0], [0, 2, 0], [0, 0, 2]])
C = np.array([2, 1, 0])
D = np.array([[3, 2, 1], [0, 5, 6], [8, -1, 2]])

print(A.trace())
print(B.trace())
# print(C.trace()) # nie da sie przez rozmiar macierzy
print(D.trace())
