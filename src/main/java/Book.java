import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private String genre;
    private ArrayList<Book> bookList;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookList = new ArrayList<>();
    }
    public int bookCounter() {
        return this.bookList.size();
    }

    public void add(Book book){
        this.bookList.add(book);
    }

    public Book removeFromList () {
        Book bookRemoved = null;
        if(this.bookCounter() > 0) {
            bookRemoved = this.bookList.remove(0);
        }
        return bookRemoved;
    }
}
