import java.io.*;
public class Ten
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

        Box b=new Box();                 
        Cube cu=new Cube();                  
        Cylinder cr=new Cylinder();
        Cone co=new Cone();
 
        System.out.println("1. Box");             
        System.out.println("2. Cube");
        System.out.println("3. Cylinder");
        System.out.println("4. Cone");
 
        System.out.println("enter your choice:");      
        int a= Integer.parseInt(br.readLine());
 
        switch (a)                     
        {
            case 1:
                System.out.println("Enter value for length:");
                float length= Float.parseFloat(br.readLine());
     
                System.out.println("Enter value for breadth:");
                float breadth= Float.parseFloat(br.readLine());

                System.out.println("Enter value for height:");
                float height= Float.parseFloat(br.readLine());
                
                System.out.println("The surface area for box is=" + b.surfaceArea(length,breadth,height));
                System.out.println("The volume of box=" + b.volume(length,breadth,height));
 
                break;
 
            case 2:
                System.out.println("Enter value for side:");
                Float side= Float.parseFloat(br.readLine());
 
                System.out.println("The surface area for cube is=" + cu.surfaceArea(side));
                System.out.println("The volume of cube=" + cu.volume(side));
                break;

            case 3:
 
                System.out.println("Enter value for radius:");
                float radius= Float.parseFloat(br.readLine());
 
                System.out.println("Enter value for height:");
                float height1= Float.parseFloat(br.readLine());
 
                System.out.println("The surface area for cylinder is=" + cr.surfaceArea(radius,height1));
                System.out.println("The volume of cylinder is=" + cr.volume(radius,height1));
                break;
 
            case 4:
 
                System.out.println("Enter value for radius:");
                float radius1= Float.parseFloat(br.readLine());
 
                System.out.println("Enter value for height:");
                float height2= Float.parseFloat(br.readLine());
 
                System.out.println("The surface area for cone is=" + co.surfaceArea(radius1,height2));
                System.out.println("The volume of cone is=" + co.volume(radius1,height2));
                break;
 
            case 5:
                System.exit(0);
 
            default:
                System.out.println("Invalid Entry!");
        }
    }
}
class Box
{
    public float surfaceArea(float length,float breadth,float height)
    {
        return (2*((length*breadth)+(breadth*height)+(height*length))) ;
    }
 
    public float volume(float length,float breadth,float height)
    {
        return (length*breadth*height );
    }
}
 
class Cube
{
    public float surfaceArea(float side)    
    {
        return 6*side*side;
    }
 
    public float volume(float side)     
    {
        return (side*side*side);
    }
}
 
class Cylinder
{
    public float surfaceArea(float radius,float height)
    {
        return (2*22/7*radius*height );
    }
 
    public float volume(float radius,float height)
    {
        return (22/7*radius*radius*height );
    }
}
 
class Cone
{
    public float surfaceArea(float radius,float height)
    {
        return ((22/7*radius*radius)+(22/7*radius*((height*height)+(radius*radius))*1/2));
    }
 
    public float volume(float radius,float height)
    {
        return (22/7*radius*radius*(height/3));
    }
}

//In Scanner class

import java.util.*;
public class Ten
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Box b=new Box();                 
        Cube cu=new Cube();                  
        Cylinder cr=new Cylinder();
        Cone co=new Cone(); 
        
        System.out.println("1. Box");             
        System.out.println("2. Cube");
        System.out.println("3. Cylinder");
        System.out.println("4. Cone");
 
        System.out.println("enter your choice:");      
        int a= sc.nextInt();
 
        switch (a)                     
        {
            case 1:
                System.out.println("Enter value for length:");
                float length = sc.nextFloat();
     
                System.out.println("Enter value for breadth:");
                float breadth= sc.nextFloat();

                System.out.println("Enter value for height:");
                float height= sc.nextFloat();
                
                System.out.println("The surface area for box is=" + b.surfaceArea(length,breadth,height));
                System.out.println("The volume of box=" + b.volume(length,breadth,height));
 
                break;
 
            case 2:
                System.out.println("Enter value for side:");
                Float side= sc.nextFloat();;
 
                System.out.println("The surface area for cube is=" + cu.surfaceArea(side));
                System.out.println("The volume of cube=" + cu.volume(side));
                break;

            case 3:
 
                System.out.println("Enter value for radius:");
                float radius= sc.nextFloat();;
 
                System.out.println("Enter value for height:");
                float height1= sc.nextFloat();;
 
                System.out.println("The surface area for cylinder is=" + cr.surfaceArea(radius,height1));
                System.out.println("The volume of cylinder is=" + cr.volume(radius,height1));
                break;
 
            case 4:
 
                System.out.println("Enter value for radius:");
                float radius1= sc.nextFloat();;
 
                System.out.println("Enter value for height:");
                float height2= sc.nextFloat();;
 
                System.out.println("The surface area for cone is=" + co.surfaceArea(radius1,height2));
                System.out.println("The volume of cone is=" + co.volume(radius1,height2));
                break;
 
            case 5:
                System.exit(0);
 
            default:
                System.out.println("Invalid Entry!");
        }
    }
}
