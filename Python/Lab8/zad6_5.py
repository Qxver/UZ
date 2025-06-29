import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(-3, 2, 100)
y = x ** 2
punkty = [-2, 0, 1]

for i in punkty:
    a = 2 * i
    y0 = i ** 2
    styczna = y0 + a * (x - i)
    plt.plot(x, styczna, linestyle="--")

plt.plot(x, y)
plt.show()