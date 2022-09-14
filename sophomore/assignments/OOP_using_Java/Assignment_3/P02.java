// An example class to understand need of
// constructor overloading.
class Building
{
    double width, height,depth;

    // constructor used when all dimensions
    // specified
    Building(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume
    double volume()
    {
        return width * height * depth;
    }

    Building(double len) {
        width = height = depth = len;
    }

    Building() {
        width = height = depth = 0;
    }
}

class Main {
    public static void main(String[] args) {
        Building myBuilding1 = new Building(10,20,15);
        Building myBuilding2 = new Building();
        Building myCube = new Building(7);

        double vol;
        vol = myBuilding1.volume();
        System.out.println("Volume of myBuilding1 is: " +vol);

        vol = myBuilding2.volume();
        System.out.println("Volume of myBuilding2 is: " +vol);

        vol = myCube.volume();
        System.out.println("Volume of myCube is: " +vol);
    }
}