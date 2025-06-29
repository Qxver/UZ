class Student:
    def __init__(self, name, last_name, index):
        self.name = name
        self.last_name = last_name
        self.index = index


class Employee:
    def __init__(self, salary, position):
        self.salary = salary
        self.position = position


class WorkingStudent(Student, Employee):
    def __init__(self, name, last_name, index, salary, position):
        Student.__init__(self, name, last_name, index)
        Employee.__init__(self, salary, position)


workingStudent1 = WorkingStudent("Jan", "Kowalski", "839193", "5000", "Software engineer")
print(f"{workingStudent1.name} {workingStudent1.last_name}, {workingStudent1.index}: {workingStudent1.salary} {workingStudent1.position}")
