package Week06.Labsheet09Exercise02;

public class Ellipse extends Shape  {

    private double majorAxis;
    private double minorAxis;

    public Ellipse() {
        super("Ellipse");
        setMajorAxis(0);
        setMinorAxis(0);
    }

    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    public double area(){
        double pie = 3.14;
        return pie*(getMajorAxis()*getMinorAxis());
    }

    public double perimeter(){

        return 2*Math.PI*Math.sqrt((getMajorAxis()*getMajorAxis()+getMinorAxis()*getMinorAxis())/2);
    }

    public String toString() {
        return "Shape Type " + type + "\nArea " + String.format("%.2f",area()) + "\nPerimeter " + String.format("%.2f", perimeter());
    }
}
