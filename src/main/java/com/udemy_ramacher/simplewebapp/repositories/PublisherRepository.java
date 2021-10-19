package com.udemy_ramacher.simplewebapp.repositories;

import com.udemy_ramacher.simplewebapp.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
