package ocp.solution;

public class Sport implements DrivingMode {

    private final int POWER = 500;
    private final int SUSPENSION_HEIGHT = 10;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeight() {
        return SUSPENSION_HEIGHT;
    }

}
