class Note:
    def __init__(self, oceny):
        self.oceny = oceny


class Student(Note):
    def __init__(self, oceny, name, last_name, age, indexNr):
        super().__init__(oceny)
        self.name = name
        self.last_name = last_name
        self.age = age
        self.indexNr = indexNr



student1 = Student({"matematyka": 5, "fizyka": 4, "angielski": 5, "programowanie": 4},"Jan", "Nowak", 20, "182333")
student2 = Student({"matematyka": 3, "fizyka": 3, "angielski": 5, "programowanie": 5},"Jakub", "Kowalski", 21, "322511")
print(f"{student1.name} {student1.last_name}: {student1.oceny}")
print(f"{student2.name} {student2.last_name}: {student2.oceny}")