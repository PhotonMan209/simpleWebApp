package com.udemy_ramacher.simplewebapp.controllers;

import com.udemy_ramacher.simplewebapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController
{
	private final BookRepository bookRepository;

	public BookController(BookRepository bookRepository)
	{
		this.bookRepository = bookRepository;
	}

	@GetMapping("/books")
	public String getBooks(Model model)
	{
		model.addAttribute("books", bookRepository.findAll());
		return "books/list";
	}
}
