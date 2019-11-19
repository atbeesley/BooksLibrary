import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> library;
    private int capacity;


    public Library(int capacity) {
        this.library = new ArrayList<Book>();
        this.capacity = capacity;
    }


    public int countBooks() {
        return library.size();
    }

    public void addBook(Book book) {
        if (this.countBooks() < this.capacity)
         this.library.add(book);
    }
}
