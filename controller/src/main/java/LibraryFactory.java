import lombok.Data;

import java.util.ArrayList;

@Data
final class LibraryFactory {
    Library createLibrary(ArrayList<Book> books) {
        return new Library(books);
    }
}
