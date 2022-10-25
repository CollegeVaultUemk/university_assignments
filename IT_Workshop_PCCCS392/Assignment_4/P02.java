class P2
{
    public static void main(String[] args) {
        display();
        P2 p = new P2();
        p.show();
    }
    static void display()
    {
        System.out.println("Static method");
    }
    void show()
    {
        System.out.println("Non static method");
    }
}