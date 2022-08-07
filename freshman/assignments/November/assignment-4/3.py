def reverse(num):
    tempnum = num;
    s = 0;
    while (tempnum > 0):
        r = tempnum % 10;
        s = (s*10) + r ;
        tempnum = tempnum // 10;
    print ("The reversed number is ", s)
x = int(input("Enter a number to reverse: "));
print(reverse(x));