package com.udemy_ramacher.simplewebapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String addressLineOne;
	private String city;
	private String state;
	private Integer zip;

	public Publisher()
	{

	}

	public Publisher(String addressLineOne, String city, String state, Integer zip)
	{
		this.addressLineOne = addressLineOne;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getAddressLineOne()
	{
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne)
	{
		this.addressLineOne = addressLineOne;
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
				", addressLineOne='" + addressLineOne + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zip=" + zip +
				'}';
	}
}
