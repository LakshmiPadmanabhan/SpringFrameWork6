package lakshmi.springframework.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lakshmi.springframework.spring6webapp.domain.Author;
import lakshmi.springframework.spring6webapp.domain.Book;
import lakshmi.springframework.spring6webapp.domain.Publisher;
import lakshmi.springframework.spring6webapp.repositories.AuthorRepository;
import lakshmi.springframework.spring6webapp.repositories.BookRepository;
import lakshmi.springframework.spring6webapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("54757585");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        
        Publisher p1=new Publisher();
        p1.setPublisherName("Lakshmi");
        p1.setCity("TVM");
        p1.setState("KERALA");
        p1.setAddress("THALIYAL,KARAMANA");
        p1.setZipCode("695-002");
        
        Publisher p1Saved=publisherRepository.save(p1);
        
        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher count: "+publisherRepository.count());
		
	}
	
}
