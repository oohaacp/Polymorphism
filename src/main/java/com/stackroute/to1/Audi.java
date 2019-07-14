package main.java.com.stackroute.to1;

public class Audi extends Car
{

        public Audi(String engineName, int cylinderCount) {
            super(engineName, cylinderCount);
        }

        @Override
        public void displayCarInfo(){
            System.out.println("Audi Car Details");
            System.out.println("Audi car has "+getCylinder()+" cylinders in "+getEngineName()+" engine and it has "+getWheels()+"wheels");
        }

    }
