import random

dlugosc = int(input("Podaj dlugosc odgadywanej sekwencji: "))
print("Podaj zakres losowania liczb.")
min = int(input("min: "))
max = int(input("max: "))
random = random.choices([x for x in range(min, max)], k=dlugosc)
guesses = []
while random != guesses:
    correct = 0
    different_position = 0
    guesses = []
    for i in random:
        guess = int(input("Podaj cyfre w zakresie 1-3: "))
        guesses.append(guess)
        if guess != i:
            if guess in random:
                different_position += 1
        else:
            correct += 1
    if correct < dlugosc-1:
        print(guesses)
        print(f"{correct} cyfr jest na swoim miejscu.")
        print(f"{different_position} cyfr znajduje sie w sekwencji, ale na innej pozycji")
    else:
        print(f"Gratulacje, odgadnieto {correct} z {dlugosc} cyfr w sekwencji!")
        print(f"Sekwencja: {random}")
        break
