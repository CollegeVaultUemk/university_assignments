a = float(input("Input value of first number: "))
b = float(input("Input value of second number: "))

# Addition
add = a + b
print("The addition of these two numbers is ", add)

# Subtraction (logical)
if a >= b:
    sub = a - b
elif a <= b:
    sub = b - a
print("The subtraction of these two numbers is ", sub)

# Multiplication
mul = a * b 
print("The multiplication of these two numbers is ", mul)

# Division (logical)
if a >= b:
    div = a / b
elif a <= b:
    div = b / a
print("The division of these two numbers is ", div)

