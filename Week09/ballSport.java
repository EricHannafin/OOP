package Week09;

public abstract class ballSport  {

    String name;
    int yearsEstablished;

    public ballSport(String name, int yearsEstablished) {
        setName(name);
        setYearsEstablished(yearsEstablished);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsEstablished() {
        return yearsEstablished;
    }

    public void setYearsEstablished(int yearsEstablished) {
        this.yearsEstablished = yearsEstablished;
    }

    @Override
    public String toString() {
        return "Name of sport: " + getName() + "\nYears Established: " + getYearsEstablished();
    }
}
