class p4
{
    int a;
    int b;
    p4()
    { 
        this(10, 20);
        System.out.println("Default constructor \n");
    }
    p4(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
    public static void main(String[] args)
    {
        p4 object = new p4();
    }
}