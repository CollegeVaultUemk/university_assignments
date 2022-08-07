def evensum():
    sum=0
    for i in range(1,11,1):
        if i%2==0:
            sum+=i
    print("Sum of all even numbers between 1 and 10 is", sum);
evensum()