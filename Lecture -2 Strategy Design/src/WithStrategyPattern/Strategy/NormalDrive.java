package WithStrategyPattern.Strategy;

public class NormalDrive implements Drive_Strategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive");
    }
}
