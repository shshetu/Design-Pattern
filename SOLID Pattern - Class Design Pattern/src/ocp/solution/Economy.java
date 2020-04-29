package ocp.solution;

public class Economy implements DrivingMode {
    private final int POWER = 300;
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
