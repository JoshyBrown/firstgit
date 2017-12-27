package org.formation.test;

import org.formation.entity.Professor;
import org.formation.entity.Student;
import org.formation.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class TestMain {

	public static void main(String[] args) {

				// Professor prof = null;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction trans = session.getTransaction();
		
		try {
			
			trans.begin();
			
			// 1. tester la persistance des deux côtés
//			Professor prof = new Professor();
//			prof.setName("bill");
//			session.save(prof);
			
//			Student stud1 = new Student();
//			Student stud2 = new Student();
//			Student stud3 = new Student();
//			
//			stud1.setName("Mona");
//			stud2.setName("Nicole");
//			stud3.setName("Ophelie");
//			
//			session.save(stud1);
//			session.save(stud2);
//			session.save(stud3);
			
			// 2. tester le OneToMany
			
//			Student stud1 = new Student();
//			stud1.setName("Francis");
//			Student stud2 = new Student();
//			stud2.setName("George");
//			Student stud3 = new Student();
//			stud3.setName("Henry");
//			Student stud4 = new Student();
//			stud4.setName("Igor");
//			Professor prof = new Professor();
//			prof.setName("Gary");
//			
//			stud1.setProfesseur(prof);
//			stud2.setProfesseur(prof);
//			stud3.setProfesseur(prof);
//			stud4.setProfesseur(prof);
//			// si on voulait essayer avec le prof :
//			// prof.setStudents().addStudents();
//			
//			session.persist(stud1);
//			session.persist(stud2);
//			session.persist(stud3);
//			session.persist(stud4);
//			session.persist(prof);
			
			// 3. affecter un nouveau professeur aux étudiants + changer le nom du professeur 
			// !!! prob au niveau des étudiants !!! à vérifier
			
//			Professor prof = new Professor();
//			prof.setName("Hubert");

//			Professor prof = (Professor) session.get(Professor.class, 4L);
//			Student stud1 = (Student) session.get(Student.class, 11L);
//			Student stud2 = (Student) session.get(Student.class, 12L);
//			Student stud3 = (Student) session.get(Student.class, 13L);
//			
//			stud1.setProfesseur(prof);
//			stud2.setProfesseur(prof);
//			stud3.setProfesseur(prof);
//			
//			session.persist(prof);
			
//			Professor prof = (Professor) session.get(Professor.class, 3L);
//			prof.setName("Isabelle");
//			
//			session.persist(prof);
			
			// 4. Récupérer la liste des students pour un professeur EN session. Puis refaire pour un professeur HORS session. 
//			
//			Professor prof = (Professor) session.get(Professor.class, 3L);
//			System.out.println(prof.getStudents());
			
				//prof = (Professor) session.get(Professor.class, 3L);
			// prof.getStudents().size();
			
			trans.commit();
			
		} catch (Exception e) {

			if (trans != null) {
				trans.rollback();
				
			}
			e.printStackTrace();
		
		} finally {
			
		} 
		
		// récupérer la liste hors session
				//System.out.println(prof.getStudents());
		
		
	}

}
