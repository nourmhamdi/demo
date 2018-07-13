package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

public class Contact implements  Serializable {
		private long id ;
		private String nom;
		private String prenom;
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
		public Contact(long id, String nom, String prenom, Date dateDeNaissance, String email, long tel,
				String photos) {
			super();
			this.id = id;
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
