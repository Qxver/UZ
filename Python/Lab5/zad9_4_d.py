inw_plik = open('inw.txt', 'r')
inw = inw_plik.read()
lines = inw.split('\n')
new_lines = []
for i, line in enumerate(lines):
    if not line:
        new_lines.append('')
        continue
    if i % 2 == 0:
        new_lines.append(line[:1].upper() + line[1:])
    else:
        new_lines.append(line[:1].lower() + line[1:])

wielka_co_2_wersy = '\n'.join(new_lines)
print(wielka_co_2_wersy)