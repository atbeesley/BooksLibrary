import org.junit.Before;

public class LibraryTest {

    Library library;

    @Before
    public void setUp(){
        library = new Library("Fountainbridge");
        book1 = new Book("Harry Potter 1", "JK Rowling", "Magic");
        book2 = new Book("Harry Potter 2", "JK Rowling", "Magic");
        book3 = new Book("Harry Potter 3", "JK Rowling", "Magic");
    }

}
