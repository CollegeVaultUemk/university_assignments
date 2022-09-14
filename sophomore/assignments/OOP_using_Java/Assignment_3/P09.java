class P9
{
    int a = 10;
    int b = 20;
    int sum(int a, int b)
    {
        System.out.println("Suppressing local variables...");
        return (this.a + this.b);
    }
    public static void main(String[] args)
    {
        P9 ob = new P9();
        int k = ob.sum(2,3);
        System.out.println(k);
    }
}