package activities;

public class Activity1 {

    public static void main(String []ar) {

        Car nexon = new Car();
        nexon.make=2014;
        nexon.color="Black";
        nexon.transmission="Manual";

        nexon.displayCharacteristics();
        nexon.accelerate();
        nexon.brake();
    }
}
