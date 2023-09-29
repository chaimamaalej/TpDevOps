package com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor

@DiscriminatorValue("ens") 


public class EnseignantChercheur extends Membre implements Serializable{
	
	
	@NonNull
	private String grade;
	@NonNull
	private String etablissement;
	
	@OneToMany(mappedBy = "encadrant") 
    private Collection<Etudiant> listEtudiant;
	

	@Builder
	public EnseignantChercheur(String cin, String nom, String prenom,
			java.util. Date dateNaissance, String cv, String email,  String password,
			 Date dateInscription, String sujet,  String diplome, String etablissement, String grade) {
		super(cin, nom, prenom, dateNaissance, cv, email, password);
		this.grade = grade;
		this.etablissement = etablissement;
	}

}
