package Object_Oriented_HackerRank_30DaysOfCode;

/**
 * Created by blaise on 8/8/17.
 */
public abstract class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}