package org.example.bonusHomework;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(30);
        System.out.println("Current amount of fuel " + car.getFuelInTank());
        car.addFuel(20);
        System.out.println("Current amount of fuel " + car.getFuelInTank());

        car.drive(300);
        System.out.println("Current amount of fuel " + car.getFuelInTank());

    }
}
