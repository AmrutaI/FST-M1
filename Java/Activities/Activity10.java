package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Red");
        hs.add("Yellow");
        hs.add("Blue");
        hs.add("Green");
        hs.add("Orange");
        hs.add("Black");

        System.out.println("HashSet values :: " + hs);

        System.out.println("Size of HashSet :: " + hs.size());


        System.out.println("Removing Red from HashSet :: " + hs.remove("Red"));

        if(hs.remove("Purple")) {
            System.out.println("Purple removed from the Set");
        } else {
            System.out.println("Purple is not present in the Set");
        }


        System.out.println("Checking if Black is present :: " + hs.contains("Black"));

        System.out.println("Updated HashSet :: " + hs);
    }
}