package Activities;

class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity8 {
    public static void main(String[] a){
        try {

            Activity8.exceptionTest("Printing to console");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("Will not execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch :: " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException(" the String value is null");
        } else {
            System.out.println(str);
        }
    }
}