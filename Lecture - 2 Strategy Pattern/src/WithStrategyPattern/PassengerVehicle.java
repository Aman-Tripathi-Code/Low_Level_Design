package WithStrategyPattern;

import WithStrategyPattern.Strategy.Drive_Strategy;
import WithStrategyPattern.Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new NormalDrive());
    }
}
