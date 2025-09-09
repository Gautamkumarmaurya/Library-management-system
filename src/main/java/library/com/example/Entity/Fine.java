package library.com.example.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "fines")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "issued_book_id", nullable = false)
    private IssuedBook issuedBook;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private Boolean paid = false;
}
