package Week01.Lab01;

import java.util.Scanner;
//import java.lang.*;

public class PlanetGravity {

    public static void main(String[] args) {

        double g = 9.81;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the mass of planet Earth: ");
        double earthMass = sc.nextDouble();

        System.out.println("Please enter the radius of planet Earth: ");
        double earthRadius = sc.nextDouble();

        System.out.println("Please enter the mass of the other planet: ");
        double otherPlanetMass = sc.nextDouble();

        System.out.println("Please enter the mass of the other planet: ");
        double otherPlanetRadius = sc.nextDouble();


        double acceleration = g * (otherPlanetMass) * (earthRadius * earthRadius) / (earthMass * (otherPlanetRadius * otherPlanetRadius));
        //dont know how to enter the formula

        System.out.println("The acceleration due to gravity on the planet is: " + String.format("%.2f", acceleration));

        sc.close();

    }

}
