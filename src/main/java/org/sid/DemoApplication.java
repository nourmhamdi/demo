package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ContactRepository contactRepository ;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contact( "hassani", "Mohammed", df.parse("12/01/1998"),"nour.mhamdi12@gmail.com",66485, null));
		contactRepository.save(new Contact( "mhamdi", "Nour", df.parse("12/01/1998"),"nour.mhamdi12@gmail.com",66485, null));
		contactRepository.save(new Contact( "mallessi", "ghada", df.parse("12/01/1998"),"nour.mhamdi12@gmail.com",66485, null));
contactRepository.findAll().forEach(c->{
	System.out.println(c.getNom());
	
});

	}
}
