package library.com.example.DTO;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IssuedBookDTO {
    private Long id;
    private Long userId;
    private Long bookId;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private String status;
}
