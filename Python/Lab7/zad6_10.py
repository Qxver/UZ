class Student:
    def __init__(self, name, last_name, index):
        self.name = name
        self.last_name = last_name
        self.index = index

    def __str__(self):
        return f"{self.name} {self.last_name}, Index: {self.index}"

    def line(self):
        return f"{self.name} {self.last_name}, Index: {self.index}\n"

class Group:
    def __init__(self):
        self.students = []

    def add_student(self, student):
        self.students.append(student)

    def get_students(self):
        for student in self.students:
            print(student)


student1 = Student("Jan", "Kowalski", "218441")
student2 = Student("Jakub", "Nowak", "393855")
student3 = Student("Michal", "Wisniewski", "558110")

group = Group()
group.add_student(student1)
group.add_student(student2)
group.add_student(student3)

try:
    file = open("file.txt", "w")
    for student in group.students:
        file.write(student.line())

except IOError:
        print(f"Blad zapisu: Nie udalo sie zapisac danych do pliku.")

try:
    file = open("file.txt", "r")
    print(file.read())

except FileNotFoundError:
    print(f"Blad odczytu, plik nie istnieje.")
except IOError:
    print(f"Błąd odczytu, nie udalo sie otworzyc pliku.")
