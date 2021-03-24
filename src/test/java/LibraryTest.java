import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void before() {
        library = new Library(3);
        book = new Book("Wuthering Heights", "Emily Bronte", "Gothic");
        book1 = new Book("Klara and the Sun", "Kazuo Ishiguro", "Sci Fi");
        book2 = new Book("Farenheit 451", "Ray Bradbury", "Thriller");
        book3 = new Book("Outline", "Rachel Cusk", "Psychological Fiction");
    }

    @Test
    public void canCountBooks () {
        library.bookCount();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToStock() {
        library.add(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBookFromStock() {
        library.remove(book);
        assertEquals(0, library.bookCount());
    }




}
