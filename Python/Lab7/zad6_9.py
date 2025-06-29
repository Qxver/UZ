try:
    file = open("file.txt", "r")
    print(file.read())

except IOError:
    print("Wystapil blad")