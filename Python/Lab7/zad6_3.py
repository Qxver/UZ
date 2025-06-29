class Osoba:
    def __init__(self, name, last_name, age):
        self.name = name
        self.last_name = last_name
        self.age = age

    def getName(self):
        return self.name

    def getLastName(self):
        return self.last_name

    def getAge(self):
        return self.age


class Student(Osoba):
    def __init__(self, name, last_name, age, indexNr):
        Osoba.__init__(self, name, last_name, age)
        self.indexNr = indexNr
        
    def getIndexNr(self):
        return self.indexNr



osoba1 = Student("Jan", "Nowak", 20, "329190")
print(osoba1.getName())
print(osoba1.getLastName())
print(osoba1.getAge())
print(osoba1.getIndexNr())