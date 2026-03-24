package br.com.fiap.gerencialivros.repositories;

import br.com.fiap.gerencialivros.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
