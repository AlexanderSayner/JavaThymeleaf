package sandbox.front.end.simplebootstrap.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sandbox.front.end.simplebootstrap.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
