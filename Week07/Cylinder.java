package Week07;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

        this(0,0,0,0);
    }

    public Cylinder(int x, int y, double radius, double height){

        super(x,y, radius);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return 2*super.area() + getHeight()*super.perimeter();
    }

    public double volume(){
        return super.area()*getHeight();
    }

    public String toString(){

        return "Centre: " + getCentre() + "\nRadius" + getRadius() + "\nHeight " + getHeight() +
                "\nSurface Area " + area() + "\nVolume " + volume();
    }
}
