import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(0, 10, 100)

fig, ax = plt.subplots()
ax.plot(x, np.sin(x), linestyle=':')
ax.plot(x, np.sin(x + 1/4), linestyle=':')
ax.plot(x, np.sin(x + 1/3), linestyle=':')
ax.plot(x, np.sin(x + 1/2), linestyle=':')
ax.plot(x, np.cos(x - 1/4), linestyle=':')
fig.show()
