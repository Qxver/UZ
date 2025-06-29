import numpy as np


A = np.array([[1, 2], [3, 4], [5, 6], [7, 8]])
B = np.array([[2, 0, 0], [0, 2, 0], [0, 0, 2]])
C = np.array([2, 1, 0])
D = np.array([[3, 2, 1], [0, 5, 6], [8, -1, 2]])

print(f"A\n{A}\n\nB\n{B}\n\nC\n{C}\n\nD\n{D}\n")

print(B.shape==D.shape)
print(B + D)

print(A.shape==C.shape)

print(B.shape==A.shape)

print(D.shape==B.shape)
print(D * B)

print(A.shape==B.shape==C.shape)

print(C.shape==D.shape)

print(B.shape==D.shape)
print(2 * B - D)

print(D * D)

print(B.shape==D.shape)
print(B * B + D * D)

print(4 * A)

print(A.shape==B.shape)

print(B ** 2)

print(A ** 2)






