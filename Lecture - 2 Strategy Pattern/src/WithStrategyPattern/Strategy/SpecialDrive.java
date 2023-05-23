package WithStrategyPattern.Strategy;

public class SpecialDrive implements Drive_Strategy {

    @Override
    public void drive() {
        System.out.println("Special Drive");
    }
}