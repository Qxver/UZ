class Person:
    def __init__(self, name, last_name):
        self.name = name
        self.last_name = last_name


class Employee(Person):
    def __init__(self, name, last_name, salary, position):
        super().__init__(name, last_name)
        self.salary = salary
        self.position = position


employee1 = Employee("Jan", "Kowalski", 5000, "Software Engineer")
print(f"{employee1.name}, {employee1.last_name}, {employee1.salary}, {employee1.position}")