package srp.solution;

public class Vehicle {
    //create 2 variables: maxFuel, remainingFuel
    private final int maxFuel;
    private int remainingFuel;

    //initialize using constructor
    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    //getMaxFuel
    public int getMaxFuel(){
        return maxFuel;
    }
    //getRemainingFuel
    public int getRemainingFuel(){
        return remainingFuel;
    }
    //setRemainingFuel
    public void setRemainingFuel(final int remainingFuel){
        this.remainingFuel = remainingFuel;
    }
    //accelerate
    public void accelerate(){
        remainingFuel--;
    }
}
