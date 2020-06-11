package bean;

import java.util.HashSet;
import java.util.Set;

public class Salarie {

	public int id_salarie;
	public String nom;
	public String grade;
	private Set<Conge> conge = new HashSet<Conge>();
	
	public Salarie(int id_salarie, String nom, String grade,Set<Conge> conge ) {
		super();
		this.id_salarie = id_salarie;
		this.nom = nom;
		this.grade = grade;
		this.conge = conge;
	}
	
	public Salarie(String nom, String grade,Set<Conge> conge) {
		super();
		this.nom = nom;
		this.grade = grade;
		this.conge = conge;
	}
	
	public Salarie() {
		super();
	}
	
	public int getId_salarie() {
		return id_salarie;
	}
	public void setId_salarie(int id_salarie) {
		this.id_salarie = id_salarie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Set<Conge> getConge() {
		return conge;
	}

	public void setConge(Set<Conge> conge) {
		this.conge = conge;
	}
	
	
}
