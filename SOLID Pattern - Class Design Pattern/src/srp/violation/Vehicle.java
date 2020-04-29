package srp.violation;

public class Vehicle {
    private final int maxFuel;
    private int remainingFuel;

    /// this is not a car's responsibility (VIOLATION) **
    public void reFuel(){
        remainingFuel = maxFuel;
    }
    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        this.remainingFuel = maxFuel;
    }

    public int getMaxFuel(){
        return maxFuel;
    }
    public int getRemainingFuel(){
        return remainingFuel;
    }
    public void setRemainingFuel(final int remainingFuel){
        this.remainingFuel = remainingFuel;
    }
    public void accelarate(){
        remainingFuel--;
    }
}
