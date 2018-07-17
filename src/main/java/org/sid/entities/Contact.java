package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity  // mapping objet relationnel 
public class Contact implements  Serializable {
	@Id  @GeneratedValue //  id generé automatiquement 
		private long id ;
		private String nom;
		private String prenom;
		@Temporal(TemporalType.DATE) // pour formater le format de date 
		private Date dateDeNaissance ; 
		private String email; 
		private long tel;
		private String photos; 
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public Date getDateDeNaissance() {
			return dateDeNaissance;
		}
		public void setDateDeNaissance(Date dateDeNaissance) {
			this.dateDeNaissance = dateDeNaissance;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getTel() {
			return tel;
		}
		public void setTel(long tel) {
			this.tel = tel;
		}
		public String getPhotos() {
			return photos;
		}
		public void setPhotos(String photos) {
			this.photos = photos;
		}
	                                                                                                                                                                                                               
		public Contact(String nom, String prenom, Date dateDeNaissance, String email, long tel, String photos) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.dateDeNaissance = dateDeNaissance;
			this.email = email;
			this.tel = tel;
			this.photos = photos;
		}
		public Contact() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
				
		
	

}
