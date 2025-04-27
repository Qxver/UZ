inw_plik = open('inw.txt', 'r')
inw = inw_plik.read()

counter = 1
result = ""

for i in inw:
    if i == 'w':
        hex = "0x{:04x}".format(counter)
        result += f"w[{hex}]"
        counter += 1
    else:
        result += i

print(result)