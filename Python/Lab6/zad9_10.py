class Wektor:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, other):
        return Wektor(self.x + other.x, self.y + other.y)

    def __sub__(self, other):
        return Wektor(self.x - other.x, self.y - other.y)

    def __mul__(self, a):
        return Wektor(self.x * a, self.y * a)

    def __matmul__(self, other):
        return Wektor(self.x * other.x, self.y * other.y)

    def __str__(self):
        return f"Wektor({self.x}, {self.y})"


w = Wektor(3, 4)
w2 = Wektor(5, 6)
a = 5
print(w)
print(w.__add__(w2))
print(w.__sub__(w2))
print(w.__mul__(a))
print(w.__matmul__(w2))
