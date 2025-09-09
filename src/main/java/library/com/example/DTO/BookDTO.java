package library.com.example.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String category;
    private Integer totalCopies;
    private Integer availableCopies;
}
