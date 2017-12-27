package org.formation.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private int salary;
	@OneToMany(mappedBy="professeur")
	private Set<Student> students = new HashSet<>();
	
	public Professor(Long id, String name, int salary, Set<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.students = students;
	}

	public Professor() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public void addStudents(Student student) {
		// RESOLUTION DU PROBLEME INVERSE END
		
		// ajouter un professor à un student. On donne UN professor à CE student. 
		// On est déjà dans class Professor => (this) désigne l'instance courante de professor. 
		// student. => (Student student)
		// .setProfesseur => (vient de la classe Student)
		// (this) => sans this.quelquechose = désigne l'instance courante de professeur
		student.setProfesseur(this);
		
		// ajouter un student à un professor => on ajoute un student à la liste students
		// students. => liste des student
		// .add(student) => on crée le add() auquel on ajoute notre student.
		students.add(student);
		
		
	}
	
}
