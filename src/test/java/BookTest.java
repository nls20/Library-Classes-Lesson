import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;
    private Library library;

    @Before
    public void before() {
        book = new Book("Wuthering Heights", "Emily Bronte", "Gothic");
        library = new Library(3);
    }

    @Test
    public void bookListStartsEmpty() {
        assertEquals(0, book.bookCounter());
    }

}
