package main.java.com.stackroute.to1;

public class Maruthi extends Car {

    public Maruthi(String engineName, int cylinderCount) {
        super(engineName, cylinderCount);
    }

    @Override
    public void displayCarInfo() {
        System.out.println("Maruthi Car Details");
        System.out.println("Maruthi car has " + getCylinder() + " cylinders in " + getEngineName() + " engine and it has " + getWheels() + "wheels");
    }
}