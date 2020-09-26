import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;

@Data
public class Library {
    @NonNull
    private ArrayList<Book> books;

    public ArrayList<Book> findBookByAuthor(Author author) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : this.books) {
            if (author.equals(book.getAuthor())) {
                books.add(book);
            }
        }
        return books;
    }
}
