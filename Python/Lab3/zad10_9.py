import statistics

studenci = [{'imie': 'Jan', 'nazwisko': 'Kowalski', 'wiek': 21, 'oceny': [3, 4, 5, 3, 3, 2, 5, 4, 4, 4]},
            {'imie': 'Jakub', 'nazwisko': 'Nowak', 'wiek': 22, 'oceny': [5, 4, 5, 3, 4, 5, 5, 4, 3, 4]},
            {'imie': 'Marek', 'nazwisko': 'Kowal', 'wiek': 23, 'oceny': [3, 3, 3, 3, 4, 4, 4, 3, 3, 3]}]

[print(f"Srednia ocen studenta {i['imie']} {i['nazwisko']}: {sum(i['oceny']) / len(i['oceny'])}") for i in studenci]

oceny = [ocena for student in studenci for ocena in student['oceny']]

srednia_studentow = round(sum(oceny)/len(oceny), 2)
print(f"\nSrednia wszystkich studentow: {srednia_studentow}")

wiek_studentow = [i['wiek'] for i in studenci]
print(f"\nMediana wieku studentow: {statistics.median(wiek_studentow)}")

dlugosci_nazwiska = [len(i['nazwisko']) for i in studenci]
print(f"\nMediana dlugosci nazwiska studentow: {statistics.median(dlugosci_nazwiska)}")
