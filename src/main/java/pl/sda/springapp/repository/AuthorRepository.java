package pl.sda.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sda.springapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
