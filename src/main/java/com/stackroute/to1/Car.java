package main.java.com.stackroute.to1;

public class Car
{
    private String engineName;
    private int cylinders;
    private int wheels = 4;
    private boolean Engine = true;
    private  boolean engineStarted = false;

    public Car(String engineName, int cylinderCount)
    {
        this.engineName = engineName;
        this.cylinders = cylinderCount;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public int getCylinder() {
        return cylinders;
    }

    public void setCylinders(int cylinderCount) {
        this.cylinders = cylinderCount;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheelCount(int wheelCount) {
        this.wheels= wheels;
    }

    public boolean Engine() {
        return Engine;
    }

    public void setEngine(boolean engine) {
        Engine = engine;
    }

    public boolean EngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    public void displayCarInfo(){
        System.out.println("Car Details");
        System.out.println("Car has "+cylinders+" cylinders in "+engineName+" engine and it has "+wheels+"wheels");
    }

    public void startEngine(){
        if(Engine){
            engineStarted = true;
            System.out.println(engineName+" Engine is started");
        } else {
            System.out.println("There is no engine");
        }
    }

    public void accelerate(){
        if(engineStarted) {
            System.out.println("If accelerate start speed is increased");
        } else {
            System.out.println("No speed");
        }
    }

    public void brake(){
        if(engineStarted) {
            System.out.println("If we give brake the car is stop");
        } else {
            System.out.println("Please start the engine first");
        }
    }
}
