package lakshmi.springframework.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lakshmi.springframework.spring6webapp.services.BookService;

@Controller
public class BookController {
	private final BookService bs;

	public BookController(BookService bs) {
		super();
		this.bs = bs;
	}
	
	@RequestMapping("/books")
	public String getBook(Model m) {
		m.addAttribute("books", bs.findAll());
		return "books";
	}
}
