package com.udemy_ramacher.simplewebapp.controllers;

import com.udemy_ramacher.simplewebapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController
{
	private final AuthorRepository authorRepository;

	public AuthorController(AuthorRepository authorRepository) {this.authorRepository = authorRepository;}

	@GetMapping("/authors")
	public String getAuthors(Model model)
	{
		model.addAttribute("authors", authorRepository.findAll());
		return "authors/list";
	}
}
