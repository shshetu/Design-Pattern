package ocp.solution;

public class EventHandler {
    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode) {
        //set the power
        vehicle.setPower(drivingMode.getPower());
        //set the suspensionHeight
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());

        //now if we want to add another mode (Ex: Saving)  we just need to create another class: Saving
    }
}
