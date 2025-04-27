import os

inw_plik = open('inw.txt', 'r')
inw = inw_plik.read()

output_dir = "inwokacja_slowa"
os.makedirs(output_dir)

words = inw.split()

for i, word in enumerate(words, start=1):
    word_1 = ''.join(char for char in word if char.isalnum())

    file_path = os.path.join(output_dir, f"word_{i}.txt")

    with open(file_path, "w") as f:
        f.write(word_1)
