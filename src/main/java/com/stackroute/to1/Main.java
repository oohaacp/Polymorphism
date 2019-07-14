package main.java.com.stackroute.to1;
import main.java.com.stackroute.to1.Audi;
import main.java.com.stackroute.to1.Bmw;
import main.java.com.stackroute.to1.Maruthi;
import main.java.com.stackroute.to1.Car;
import java.util.*;

public class Main {

    public static void main(String[] args){

//		Bmw car
        Bmw bmw = new Bmw("straight-four",4);
        bmw.accelerate();
        bmw.startEngine();
        bmw.accelerate();
        bmw.brake();

//		Maruthi Car
        Maruthi maruthi = new Maruthi("straight-five",6);
        maruthi.displayCarInfo();

//		Audi car
        Audi audi=new Audi("straight-six",3);
        audi.displayCarInfo();

    }
}