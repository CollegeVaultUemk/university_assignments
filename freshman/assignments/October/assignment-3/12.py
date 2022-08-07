number=int(input("Enter any number: "))
container=number
reverse=0
while(number>0):
    digit=number%10
    reverse=reverse*10+digit
    number=number//10
if(container!=reverse):
    print(container, "is NOT a palindrome number.")
else:
    print(container, "is a palindrome number.")