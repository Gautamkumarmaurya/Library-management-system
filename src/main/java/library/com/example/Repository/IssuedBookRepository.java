package library.com.example.Repository;

import library.com.example.Entity.IssuedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuedBookRepository extends JpaRepository<IssuedBook, Integer> {
}
