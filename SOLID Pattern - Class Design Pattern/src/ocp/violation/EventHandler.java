package ocp.violation;

public class EventHandler {
    private Vehicle vehicle;

    //take input of Vehicle
    public EventHandler(final Vehicle vehicle){
        this.vehicle = vehicle;
    }

    //take input of Driving Mode
    public void changeDrivingMode(final DrivingMode drivingMode){
        switch (drivingMode){
            case SPORT:
                vehicle.setPower(500);
                vehicle.setSuspensionHeight(10);
                break;
            case COMFORT:
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
                break;
            default:
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
                break;
                // When we need to add another mode (eg: ECONOMY) 2 classes will change DrivingMode and EventHandler
        }
    }
}
