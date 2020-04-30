package dip;

public class RacingCar implements Vehicle{
    private final int MAXFUEL;
    private int remainingFuel;
    private int power;

    public RacingCar(final int maxFuel) {
    this.MAXFUEL = maxFuel;
    this.remainingFuel = maxFuel;
    }

    @Override
    public void accelerate() {
    power++;
    remainingFuel--;
    }
}
