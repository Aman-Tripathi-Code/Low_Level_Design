package Liskov_Substitution;

public class Motorcycle implements Bike {
    int speed;
    boolean isEngineOn;
    @Override
    public void turnOnEngine(){
        isEngineOn = true;
    }
    @Override
    public void accelerate(){
        speed = 2 * speed;
    }
}
