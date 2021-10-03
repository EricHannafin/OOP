package Week06.Labsheet09Exercise01;

public final class SelfEmployedWorker extends Employee {

    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName,lastName);
        setEstimatedIncome();
    }

    public double earnings() {

        return estimatedIncome;
    }

    public void setEstimatedIncome() {

        this.estimatedIncome = (int)(Math.random()*(900-400+1) + 400);

    }

    public String toString() {
        return "Self-employed worker's name is " + super.toString();
    }



}
