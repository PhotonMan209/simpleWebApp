package com.udemy_ramacher.simplewebapp.repositories;

import com.udemy_ramacher.simplewebapp.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
