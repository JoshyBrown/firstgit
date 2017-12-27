package org.formation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	@ManyToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="professeur_id")
	private Professor professeur;
	
	public Student(Long id, String name, Professor professeur) {
		super();
		this.id = id;
		this.name = name;
		this.professeur = professeur;
	}

	public Student() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Professor getProfesseur() {
		return professeur;
	}

	public void setProfesseur(Professor professeur) {
		this.professeur = professeur;
	}
	
}
