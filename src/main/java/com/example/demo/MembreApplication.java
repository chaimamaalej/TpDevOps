package com.example.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.MemberRepository;
import com.example.demo.entities.EnseignantChercheur;
import com.example.demo.entities.Etudiant;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class MembreApplication implements CommandLineRunner{
MemberRepository memberRepository;

	public static void main(String[] args) {
		SpringApplication.run(MembreApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		
		Etudiant etd1=Etudiant.builder()
				.cin("123456")
				.dateInscription(new Date())
				.dateNaissance(new Date())
				.diplome("mastère")
				.email("etd1@gmail.com")
				.password("pass1")
				.encadrant(null)
				.cv("cv1")
				.nom("abid")
				.prenom("bilel")
				.sujet("blockhain")
				.build();
		
		Etudiant etd2=Etudiant.builder()
				.cin("234567")
				.dateInscription(new Date())
				.dateNaissance(new Date())
				.diplome("mastère")
				.email("etd2@gmail.com")
				.password("pass2")
				.encadrant(null)
				.cv("cv2")
				.nom("maalej")
				.prenom("chaima)")
				.sujet("devops")
				.build();
		
		EnseignantChercheur ens1=EnseignantChercheur.builder()       
	            .cin("6545356")
	            .nom("zghal")
				.prenom("siwar")
				.dateNaissance(new Date())
				.cv("cv1")
				.email("ens1@gmail.com")
				.password("passw1")
				.grade("grade1")
				.etablissement("etablissement1")
				.build();
		
		EnseignantChercheur ens2=EnseignantChercheur.builder()       
	            .cin("6545356")
	            .nom("benrhouma")
				.prenom("hadil")
				.dateNaissance(new Date())
				.cv("cv2")
				.email("end2@gmail.com")
				.password("passw2")
				.grade("grade1")
				.etablissement("etablissement1")
				.build();
	
		memberRepository.save(etd1);
		memberRepository.save(etd2);
		memberRepository.save(ens1);
		memberRepository.save(ens2);
		
		memberRepository.findAll();
		memberRepository.findById(2L);
		memberRepository.delete(etd2);
		etd1.setCv("mon cv");
		memberRepository.save(etd1);
	}
	
	
}
