package main.java.com.stackroute.to1;

public class Bmw extends Car {

    public Bmw(String engineName, int cylinderCount) {
        super(engineName, cylinderCount);
    }

    @Override
    public void displayCarInfo() {
        System.out.println("Ford Car Details");
        System.out.println("Ford car has " + getCylinder() + " cylinders in " + getEngineName() + " engine and it has " + getWheels() + "wheels");
    }
}
