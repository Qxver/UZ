inw_plik = open('inw.txt', 'r')
inw = inw_plik.read()
co_2_litera = ''.join([char for i, char in enumerate(inw) if i % 2 == 0])
print(co_2_litera)