import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setUp(){
        this.library = new Library(5);
        book1 = new Book("Harry Potter 1", "JK Rowling", "Magic");
        book2 = new Book("Harry Potter 2", "JK Rowling", "Magic");
        book3 = new Book("Harry Potter 3", "JK Rowling", "Magic");
    }

    @Test
    public void countBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test public void addBook(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

}
