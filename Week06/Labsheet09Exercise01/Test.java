package Week06.Labsheet09Exercise01;

public class Test {
    public static void main(String args[])
    {
        Employee employeeRef; //a reference to the Employee superclass
        Boss b1 = new Boss("Joe","Smith",750.50);
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);

        employeeRef=b1; //recall a Boss "is a" Employee so this assignment is allowed

        //will now use the Employee reference object to display the correct information via polymorphism

        System.out.println(employeeRef.toString() + " and the earnings were €" +
                String.format("%.2f",employeeRef.earnings()));

        employeeRef=hw1; //recall that an HourlyWorker "is a" Employee so this is okay too

        //will now use the Employee reference object to display the correct information via polymorphism

        //note the generic nature of the code here

        System.out.println("\n" + employeeRef.toString() + " and the earnings were €" +
                String.format("%.2f",employeeRef.earnings()));

        SelfEmployedWorker sew1 = new SelfEmployedWorker("John", "Smith");

        employeeRef=sew1;

        System.out.println("\n" + employeeRef.toString() + " and the earnings were €" +
                String.format("%.2f",employeeRef.earnings()));

        Employee employees[] = new Employee[3];

        employees[0] = b1;
        employees[1] = hw1;
        employees[2] = sew1;

        for (int i = 0; i< employees.length;i++){

            System.out.println("\n" + employees[i].toString() + " and the earnings were €" + String.format("%.2f",employees[i].earnings()) + "\n");
        }
    }
}

