package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private int maxPassengers;
    private List< String> passengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane( int maxPassengers) {
        this.maxPassengers=maxPassengers;
        this.passengers=new ArrayList<>();

    }

    public void onboard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return this.lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return this.lastTimeLanded;
    }

    public List<String> getPassengers() {
        return this.passengers;
    }
}
public class Activity6 {

    public static void main (String []ar) {
        try {
            Plane jet = new Plane(10);

            jet.onboard("Pass1");
            jet.onboard("Pass2");

            System.out.println("Passengers boarded" + jet.getPassengers());
            System.out.println("Plane tookoff at " + jet.takeOff());

            Thread.sleep(10000);

            jet.land();

            System.out.println("Plane landed at " + jet.getLastTimeLanded());
            System.out.println("Passengers offboarded " + jet.getPassengers());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
