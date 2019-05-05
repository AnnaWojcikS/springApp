package pl.sda.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.springapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
