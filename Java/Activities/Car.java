package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car() {
        this.tyres=4;
        this.doors=4;
    }

    public void displayCharacteristics() {

    System.out.println("Characteristics of the car is as below:");
        System.out.println("Make of the car:"+this.make);
        System.out.println("Color of the car:"+this.color);
        System.out.println("Transmission type of the car:"+this.transmission);
        System.out.println("No of tyres in the car:"+this.tyres);
        System.out.println("No of doors in the car:"+this.doors);

    }

    public void brake() {

        System.out.println("You have applied brakes!!!the car has stopped");
    }

    public void accelerate() {
        System.out.println("You are accelerating!!!the car is moving forward");
    }
    }
