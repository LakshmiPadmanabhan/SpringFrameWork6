package lakshmi.springframework.spring6webapp.services;

import lakshmi.springframework.spring6webapp.domain.Book;

public interface BookService {

	Iterable<Book> findAll();
} 
