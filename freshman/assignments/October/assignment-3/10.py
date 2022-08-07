a = float(input("Input a number: "))
if a > 0:
    print ("The number is a positive number, checking if odd or even...")
    if a%2:
        print("The number is odd.")
    else:
        print("The number is even.")
elif a == 0:
    print("The number is zero. Skipped odd-even check.")
elif a < 0:
    print("The number is negative. Skipped odd-even check.")