def ceil(x):
    if int(x) == x:
        return int(x)
    else:
        return int(x) + 1

def floor(x):
    return int(x)


x = 5.9
print(ceil(x))
print(floor(x))