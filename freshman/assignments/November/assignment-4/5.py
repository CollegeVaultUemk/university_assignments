def calc():
    square = num*num;
    print("The square of this number is", square)
    cube = num*num*num;
    print("The cube of this number is", cube)
    return square, cube;
num = int(input("Enter number: "));
calc()