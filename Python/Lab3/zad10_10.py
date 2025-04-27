import random

random = random.choices([x for x in range(1, 5)], k=5)
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
    if correct < 4:
        print(guesses)
        print(f"{correct} cyfr jest na swoim miejscu.")
        print(f"{different_position} cyfr znajduje sie w sekwencji, ale na innej pozycji")
    else:
        print("Gratulacje, odgadnieto 4 z 5 cyfr w sekwencji!")
        print(f"Sekwencja: {random}")
        break
