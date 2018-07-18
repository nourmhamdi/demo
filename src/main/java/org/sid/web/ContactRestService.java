package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactRestService {
@Autowired
private ContactRepository contactRepository;
		@RequestMapping(value="/contacts",method=RequestMethod.GET) // consulter tous les contacts 
		public List<Contact> getContacts(){
		return contactRepository.findAll();};
		
		
		@RequestMapping(value="/contacts/{id}",method=RequestMethod.GET) // consulter un contact a l'aide de son id 
		public Optional<Contact> getContact( @PathVariable Long id ){
			return contactRepository.findById(id);}
		
		
		@RequestMapping(value="/contacts",method=RequestMethod.POST) // ajouter un contact 
		public Contact save( @RequestBody Contact c ){
			return contactRepository.save(c);}
		
		@RequestMapping(value="/contacts/{id}",method=RequestMethod.DELETE) // supprimer un contact 
		public boolean supprimer( @PathVariable long id ){
			contactRepository.deleteById(id);
			return true;
			}
		@RequestMapping(value="/contacts/{id}",method=RequestMethod.PUT) // update mais il change les champs non specifié en NULL 
		public Contact save(@PathVariable long id, @RequestBody Contact c ){
			c.setId(id);
			
			return contactRepository.save(c);}
		
		@RequestMapping(value="/chercherContact",method=RequestMethod.GET)
		public Page<Contact> chercher( 
				@RequestParam(name="mc",defaultValue="")String mc,
				@RequestParam(name="page",defaultValue="0")int page,
				@RequestParam(name="size",defaultValue="5")int size ){
			return contactRepository.chercher("%"+mc+"%", new PageRequest (page,size));};
		
		 
		
		
		
}

