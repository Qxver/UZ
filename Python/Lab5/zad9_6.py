inw_plik = open('inw.txt', 'r')

inw = inw_plik.read()
inw = inw.replace(" ", "")
print(inw)