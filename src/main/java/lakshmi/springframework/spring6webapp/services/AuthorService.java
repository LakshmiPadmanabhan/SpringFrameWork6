package lakshmi.springframework.spring6webapp.services;

import lakshmi.springframework.spring6webapp.domain.Author;

public interface AuthorService {
	Iterable<Author>findAll();
}
