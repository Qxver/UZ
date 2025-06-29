def dectobin(dec):
    result = ""

    if dec == 0:
        return "0"

    while dec > 0:
        bit = dec % 2
        result = str(bit) + result
        dec = dec // 2

    return result


print(dectobin(15))
