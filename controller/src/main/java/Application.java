import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Library library = new LibraryFactory().createLibrary(setStaticBooksInfo());
        Gson gson = new Gson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author name := ");
        Author author = new Author(scanner.nextLine());
        ArrayList<Book> resultOfSearch = library.findBookByAuthor(author);
        System.out.println(gson.toJson(resultOfSearch));
    }

    private static ArrayList<Book> setStaticBooksInfo() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter 1", new Author("Joanne Rowling"), 1997L));
        books.add(new Book("Harry Potter 2", new Author("Joanne Rowling"), 1998L));
        books.add(new Book("The Lord of the Rings", new Author("J. R. R. Tolkien"), 1954L));
        return books;
    }
}
