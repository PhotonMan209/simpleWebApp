package com.udemy_ramacher.simplewebapp.repositories;

import com.udemy_ramacher.simplewebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long>
{

}
