package Activities;

abstract class Book {
    String title;

    abstract void setTitle(String bookTitle);

    String getTitle() {
        return this.title;
    }
}

class MyBook extends Book {
     public void setTitle(String bookTitle) {
        title=bookTitle;
     }
}

public class Activity5 {

    public static void main (String []ar) {

        String title = "Harry Potter and the Philospher's stone";

        Book newNovel = new MyBook();

        newNovel.setTitle(title);

        System.out.println("Title of the book is :: "+newNovel.getTitle());
    }
}
