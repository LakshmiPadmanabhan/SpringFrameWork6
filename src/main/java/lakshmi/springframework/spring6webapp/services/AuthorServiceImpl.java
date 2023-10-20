package lakshmi.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

import lakshmi.springframework.spring6webapp.domain.Author;
import lakshmi.springframework.spring6webapp.repositories.AuthorRepository;
@Service
public class AuthorServiceImpl implements AuthorService {
	
	private final AuthorRepository ar;
	
	public AuthorServiceImpl(AuthorRepository ar) {
		super();
		this.ar = ar;
	}

	@Override
	public Iterable<Author> findAll() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

}
