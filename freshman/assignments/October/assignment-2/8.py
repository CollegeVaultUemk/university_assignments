ques = input('''Select which operation to perform ("a" for addition, "s" for subtraction, "m" for multiplication, "d" for division): ''')
a = float(input("Input first number: "))
b = float(input("Input second number: "))

if ques=="a":
    add = a + b
    print("The addition of these two numbers is ", add)
elif ques=="s":
    # Check values of a and b, and make the greater  value get subtracted
    if a >= b:
        sub = a - b
    elif a <= b:
        sub = b - a
    print("The subtraction of these two numbers is ", sub)
elif ques == "d":
    # Check the values and make the greater value get divided
    if a >= b:
        div = a / b
    elif a <= b:
        div = b / a
    print ("The division of these two numbers is ", div)
elif ques=="m":
    mul = a * b
    print("The multiplication of these two numbers is ", mul)
