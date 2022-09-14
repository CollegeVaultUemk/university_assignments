class p8
{
    int a;
    int b;
    p8(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }
    public static void main(String[] args)
    {
        p8 object = new p8(10, 20);
        object.display();
    }
}