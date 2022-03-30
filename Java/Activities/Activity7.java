package Activities;

interface BicycleParts {
 int gears=0;
 int currentSpeed =0;
}
 interface BicycleOperations {
  void applyBrake(int decrement);
  void speedUp(int increment);
}

class Bicycle implements BicycleParts,BicycleOperations {
    int gears;
    int currentSpeed;
     public Bicycle(int gears,int speed) {
         this.gears= gears;
         this.currentSpeed=speed;

     }

    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed is :: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed = currentSpeed+increment;
        System.out.println("Current speed is :: " + currentSpeed);
    }

    public String bicycleDesc() {
         return ("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

class MountainBike extends Bicycle {
     int seatheight;

     public MountainBike(int gears,int speed,int seatheight) {
         super(gears,speed);
         this.seatheight=seatheight;
     }

     public void setSeatheight(int newHeight) {
         this.seatheight=newHeight;
     }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatheight);
    }
}
public class Activity7 {

    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
