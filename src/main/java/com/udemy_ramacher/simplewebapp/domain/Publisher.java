package com.udemy_ramacher.simplewebapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String city;
	private String state;
	private Integer zip;

	@OneToMany
	@JoinColumn(name= "publisher_id")
	private Set<Book> books = new HashSet<>();

	public Publisher()
	{

	}

	public Publisher(String name, String city, String state, Integer zip)
	{
		this.name = name;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}

		Publisher publisher = (Publisher) o;

		return id != null ? id.equals(publisher.id) : publisher.id == null;
	}

	@Override
	public String toString()
	{
		return "Publisher{" +
				"id=" + id +
				", addressLineOne='" + name + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zip=" + zip +
				'}';
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String addressLineOne)
	{
		this.name = addressLineOne;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public Integer getZip()
	{
		return zip;
	}

	public void setZip(Integer zip)
	{
		this.zip = zip;
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
