package lsp;

public class Car extends Vehicle {
    @Override
    public void changeGear(Gear gear) {
        Gear actualGear = getGear();
        if(isMovingForwards(gear,actualGear) || isMovingBackwards(gear,actualGear)){
            stop();
        }
        super.changeGear(gear);
    }

    public boolean isMovingBackwards(Gear gear, Gear actualGear){
        return isMoving() && Gear.R.equals(actualGear) && Gear.D.equals(gear);
    }
    public boolean isMovingForwards(Gear gear,Gear actualGear){
        return isMoving() && Gear.D.equals(actualGear) && Gear.R.equals(gear);
    }
}
