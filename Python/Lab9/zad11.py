eps = 1.0

while 1.0 + eps != 1.0:
    eps /= 2

eps *= 2

print("Precyzja maszynowa:", eps)
