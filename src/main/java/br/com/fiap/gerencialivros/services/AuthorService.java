package br.com.fiap.gerencialivros.services;

import br.com.fiap.gerencialivros.models.Author;
import br.com.fiap.gerencialivros.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAll(){
        return authorRepository.findAll();
    }

    public Author addAuthor(Author author){
        return authorRepository.save(author);
    }

    public Author findAuthorById(Long id){
        return authorRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
    }

    public Author updateAuthor(Long id, Author newAuthor){
        findAuthorById(id);
        newAuthor.setId(id);
        return authorRepository.save(newAuthor);
    }

    public void deleteAuthorById(Long id){
        authorRepository.deleteById(id);
    }
}
