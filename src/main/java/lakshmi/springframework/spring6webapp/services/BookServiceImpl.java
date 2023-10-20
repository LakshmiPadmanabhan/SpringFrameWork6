package lakshmi.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

import lakshmi.springframework.spring6webapp.domain.Book;
import lakshmi.springframework.spring6webapp.repositories.BookRepository;
@Service
public class BookServiceImpl implements BookService {

	private final BookRepository br;
	
	public BookServiceImpl(BookRepository br) {
		super();
		this.br = br;
	}

	@Override
	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return br.findAll();
	}

}
