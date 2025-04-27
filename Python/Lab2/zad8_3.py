def kalkulator():
    a = int(input("Podaj 1 liczbe: "))
    b = int(input("Podaj 2 liczbe: "))
    operator = input("Wybierz operacje: \n"
                      "Dodawanie +\n"
                      "Odejmowanie -\n"
                      "Mnozenie *\n"
                      "Dzielenie /\n"
                      "Potegowanie ^\n")

    if operator == "+":
        return a+b
    elif operator == "-":
        return a-b
    elif operator == "*":
        return a*b
    elif operator == "/":
        return float(a/b)
    elif operator == "^":
        return pow(a, b)
    else:
        return "Bledny operator"


print(kalkulator())