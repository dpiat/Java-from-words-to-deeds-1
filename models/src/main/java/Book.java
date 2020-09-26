import lombok.*;

@Data
public class Book {
    @NonNull
    private String title;
    @NonNull
    private Author author;
    @NonNull
    private Long publicationYear;
}
