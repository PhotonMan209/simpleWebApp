package com.udemy_ramacher.simplewebapp.domain;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.Set;

@Entity
public class Author
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastJName;

	@ManyToMany(mappedBy = "authors")
	private Set<Book> books;

	public Author()
	{

	}

	public Author(String firstName, String lastJName, Set<Book> books)
	{
		this.firstName = firstName;
		this.lastJName = lastJName;
		this.books = books;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastJName()
	{
		return lastJName;
	}

	public void setLastJName(String lastJName)
	{
		this.lastJName = lastJName;
	}

	public Set<Book> getBooks()
	{
		return books;
	}

	public void setBooks(Set<Book> books)
	{
		this.books = books;
	}
}