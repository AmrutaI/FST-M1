package Activities;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Java");
        myList.add("C++");
        myList.add("Python");

        myList.add(3, "Dot Net");


        myList.add(1, "Golang");

        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("3rd element in the list is :: " + myList.get(2));
        System.out.println("Is Golang in list :: " + myList.contains("Golang"));
        System.out.println("Size of ArrayList :: " + myList.size());

        myList.remove("Dot Net");

        System.out.println("Update Size of ArrayList :: " + myList.size());
    }
}
