import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Borrower borrower;

    @Before
    public void before() {
        book = new Book("Wuthering Heights", "Emily Bronte", "Gothic");
        borrower = new Borrower();
    }

    @Test
    public void addBookToBorrowersList() {
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void borrowerCanGetBook() {
        borrower.addBook(book);
        borrower.addBook(book);
        borrower.addBook(book);
        borrower.removeBook();
        assertEquals(2, borrower.bookCount());

}
}
