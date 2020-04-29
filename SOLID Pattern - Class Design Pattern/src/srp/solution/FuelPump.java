package srp.solution;

public class FuelPump {
    public void reFuel(final Vehicle vehicle){
        final int remainingFuel = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel() - vehicle.getRemainingFuel();
        vehicle.setRemainingFuel(remainingFuel+additionalFuel);
    }
}
