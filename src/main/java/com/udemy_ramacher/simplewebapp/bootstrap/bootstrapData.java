package com.udemy_ramacher.simplewebapp.bootstrap;

import com.udemy_ramacher.simplewebapp.domain.Author;
import com.udemy_ramacher.simplewebapp.domain.Book;
import com.udemy_ramacher.simplewebapp.domain.Publisher;
import com.udemy_ramacher.simplewebapp.repositories.AuthorRepository;
import com.udemy_ramacher.simplewebapp.repositories.BookRepository;
import com.udemy_ramacher.simplewebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootstrapData implements CommandLineRunner
{
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;

	public bootstrapData(AuthorRepository authorRepository,
						 BookRepository bookRepository,
						 PublisherRepository publisherRepository)
	{
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception
	{
		Publisher publisher = new Publisher();
		publisher.setName("SFG Publishing");
		publisher.setCity("St. Petersburg");
		publisher.setState("FL");

		publisherRepository.save(publisher);

		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "123123");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		ddd.setPublisher(publisher);
		publisher.getBooks().add(ddd);

		authorRepository.save(eric);
		bookRepository.save(ddd);
		publisherRepository.save(publisher);

		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Developement withour EJB", "263450603854");
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		noEJB.setPublisher(publisher);
		publisher.getBooks().add(noEJB);

		authorRepository.save(rod);
		bookRepository.save(noEJB);
		publisherRepository.save(publisher);

		System.out.println("Publisher Count: "+ publisherRepository.count());
		System.out.println("Number of Books: " + bookRepository.count());
		System.out.println("Publisher Number of NBooks: " + publisher.getBooks().size());


	}
}
