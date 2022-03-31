package Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Red");
        hmap.put(2, "Yellow");
        hmap.put(3, "Blue");
        hmap.put(4, "Green");
        hmap.put(5, "Purple");


        System.out.println("Original map :: " + hmap);

        hmap.remove(4);

        System.out.println("After removing Green :: " + hmap);


        if(hmap.containsValue("Black")) {
            System.out.println("Black exists in the Map");
        } else {
            System.out.println("Black does not exist in the Map");
        }


        System.out.println("Number of pairs in the Map is :: " + hmap.size());
    }
}