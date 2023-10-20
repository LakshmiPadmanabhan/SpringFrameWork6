package lakshmi.springframework.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lakshmi.springframework.spring6webapp.services.AuthorService;
@Controller
public class AuthorController {
	private final AuthorService as;

	public AuthorController(AuthorService as) {
		super();
		this.as = as;
	}
	@RequestMapping("/authors")
	public String getAuthors(Model m) {
		m.addAttribute("authors", as.findAll());
		return "authors";
	}
	
}
