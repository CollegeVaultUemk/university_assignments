principal = int(input("Enter the principal (in INR, do not provide symbols): "))
interest = int(input("Enter the interest rate: "))
time = int(input("Enter the time period (in years): "))
si = (principal*interest*time)/100
print("The simple interest is", si, "INR")
profit = principal+si
print("Total profit is", profit, "INR")
