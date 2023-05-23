package WithStrategyPattern;

import WithStrategyPattern.Strategy.Drive_Strategy;

public class Vehicle {
    Drive_Strategy driveObj;

    //This is known as constructor injection
    Vehicle(Drive_Strategy driveObj){
        this.driveObj = driveObj;
    }

    public void drive(){
        driveObj.drive();
    }
}
