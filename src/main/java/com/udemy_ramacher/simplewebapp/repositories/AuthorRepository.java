package com.udemy_ramacher.simplewebapp.repositories;

import com.udemy_ramacher.simplewebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>
{

}
