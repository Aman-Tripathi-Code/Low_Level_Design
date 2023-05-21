package WithStrategyPattern;

import WithStrategyPattern.Strategy.Drive_Strategy;
import WithStrategyPattern.Strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SpecialDrive());
    }
}
