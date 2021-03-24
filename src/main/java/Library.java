import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> bookStock;

    public Library(int capacity) {
        this.capacity = capacity;
        this.bookStock = new ArrayList<>();
    }

    public int bookCount() {
        return this.bookStock.size();
    }

    public void add(Book book) {
        this.bookStock.add(book);
    }

    public void remove(Book book) {
        this.bookStock.remove(book);
    }


}
