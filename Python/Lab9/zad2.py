print("a)")
a = "100111"
print(int(a, 2))
print()

print("b)")
b = "111001001101"
print(int(b, 2))
print()

print("c)")
c = "77"
print(int(c, 8))
print()

print("d)")
d = "263"
print(int(d, 8))
print()

print("e)")
e = "7F"
print(int(e, 16))
print()

print("f)")
f = "F8FE"
print(int(f, 16))
print()

print("g)")
integer = "1A6"
fraction = "E2"
integer = int(integer, 16)
fraction = int(fraction, 16)
print(f"{integer}.{fraction}")
print()

print("h)")
integer = "77"
fraction = "44"
integer = int(integer, 8)
fraction = int(fraction, 8)
print(f"{integer}.{fraction}")
print()

print("i)")
integer = "111101"
fraction = "101"
integer = int(integer, 2)
fraction = int(fraction, 2)
print(f"{integer}.{fraction}")
print()
