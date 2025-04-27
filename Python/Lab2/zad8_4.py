a = [x for x in range(0, 10)]
b = [complex(x,x) for x in range(0, 10)]
c = [float("%.1f" % (x * 0.1)) for x in range(0, 10)]
print(a + b + c)