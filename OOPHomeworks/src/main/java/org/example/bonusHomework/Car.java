package org.example.bonusHomework;

public class Car {

    double fuelInTank;
    double fuelEfficiency;

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getFuelInTank() {
        return fuelInTank;
    }

    public void setFuelInTank(double fuelInTank) {
        this.fuelInTank = fuelInTank;
    }

    public void addFuel(double fuel){
         setFuelInTank(fuelInTank + fuel);
    }
     public void drive(double distance){

       setFuelInTank(getFuelInTank()-(distance/fuelEfficiency));
     }
}
