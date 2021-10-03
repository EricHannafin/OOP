package Week02.Exercise01and02Computer;

    public class Computer {
    private String manufacturer;
    private String type;
    private double speed;
    private int ram;
    private double price;


    public Computer() {
        manufacturer = "Not available";
        type = "Not available";
        speed = 0;
        ram = 0;
        price = 0;
    }

    public Computer(String manufacturer,String type,double speed,int ram,double price) {
        setManufacturer(manufacturer);
        setType(type);
        setSpeed(speed);
        setRam(ram);
        setPrice(price);
    }

    public String getManufacturer() {

        return manufacturer;
    }

    public String getType() {

        return type;
    }

    public double getSpeed() {

        return speed;
    }

    public int getRam() {

        return ram;
    }

    public double getPrice() {

        return price;
    }

    public void setManufacturer(String manufacturer) {

        this.manufacturer = manufacturer;
    }

    public void setType(String type) {

        this.type = type;
    }

    public void setSpeed(double speed) {
        if(speed<0)
            this.speed = speed;
    }

    public void setRam(int ram) {
        if(ram>0)
        this.ram = ram;
    }

    public void setPrice(double price) {
        if(price > 0)
        this.price = price;
    }

    public String toString() {
        return  "Manufacturer: " + getManufacturer() + "   Type: " + getType() + "   Speed: " + getSpeed()
                + "   RAM: " + getRam() + "   Price: " + getPrice();
    }
}
