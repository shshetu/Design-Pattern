package ocp.solution;

public class Comfort implements DrivingMode{
    private final int POWER = 400;
    private final int SUSPENSION_HEIGHT = 20;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeight() {
        return SUSPENSION_HEIGHT;
    }
}
