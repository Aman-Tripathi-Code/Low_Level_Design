package WithStrategyPattern;

import WithStrategyPattern.Strategy.Drive_Strategy;
import WithStrategyPattern.Strategy.SpecialDrive;

public class SportVehicle extends Vehicle{
    SportVehicle() {
        super(new SpecialDrive());
    }
}
