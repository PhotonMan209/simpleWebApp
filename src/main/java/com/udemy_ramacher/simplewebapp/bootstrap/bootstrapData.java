package com.udemy_ramacher.simplewebapp.bootstrap;

import com.udemy_ramacher.simplewebapp.domain.Author;
import com.udemy_ramacher.simplewebapp.domain.Book;
import com.udemy_ramacher.simplewebapp.repositories.AuthorRepository;
import com.udemy_ramacher.simplewebapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootstrapData implements CommandLineRunner
{
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;

	public bootstrapData(AuthorRepository authorRepository,
						 BookRepository bookRepository)
	{
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args) throws Exception
	{
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Ergagon", "123456789");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		authorRepository.save(eric);
		bookRepository.save(ddd);

		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Developement without EJB", "3939459459");

		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		authorRepository.save(rod);
		bookRepository.save(noEJB);

		System.out.println("Started in Bootstrap");
		System.out.println("Number of books " + bookRepository.count());

	}
}
