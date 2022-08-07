def maximum(a,b,c):
    if ( a > b ) and ( a > c ):
        biggest = a;
        print(x, "is the biggest number.");
    elif ( b > a ) and ( b > c ):
        biggest = b;
        print(y, "is the biggest number.");
    elif ( c > a ) and ( c > b ):
        biggest = c;
        print(z, "is the biggest number.");
    return biggest;

print("Enter the numbers in the prompt below.");
x = int(input("Enter first number: "));
y = int(input("Enter second number: "));
z = int(input("Enter third number: "));

print(maximum(x,y,z));