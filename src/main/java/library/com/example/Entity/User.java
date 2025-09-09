package library.com.example.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    @Email(message = "Invalid email format")
    private String email;

    @Column(nullable = false, length = 50)
    private String role;   // STUDENT / LIBRARIAN / ADMIN

    @Column(length = 20)
    private String contactNo;
}
