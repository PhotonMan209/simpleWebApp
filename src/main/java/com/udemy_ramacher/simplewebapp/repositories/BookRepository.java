package com.udemy_ramacher.simplewebapp.repositories;

import com.udemy_ramacher.simplewebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>
{

}
