package com.example.demo.entities;

import java.io.Serializable;

import java.util.Date;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter @Setter
@NoArgsConstructor
@DiscriminatorValue("etd") 


public class Etudiant extends Membre implements Serializable{
	@NonNull
	private Date dateInscription;
	@NonNull
	private String sujet;
	@NonNull
	private String diplome;
	
	@ManyToOne 
    private EnseignantChercheur encadrant;
	

	@Builder
	public Etudiant(String cin, String nom, String prenom,
			java.util. Date dateNaissance, String cv, String email,  String password,
			 Date dateInscription, String sujet,  String diplome, EnseignantChercheur encadrant) {
		super(cin, nom, prenom, dateNaissance, cv, email, password);
		this.dateInscription = dateInscription;
		this.sujet = sujet;
		this.diplome = diplome;
		this.encadrant = encadrant;
	}

}
