package bean;

import java.util.HashSet;
import java.util.Set;




public class Conge {
	public int id_conge;
	public String date_debut;
	public String date_fin;
	public Salarie salarie;
	
	
	
	public Conge(int id_conge, String date_debut, String date_fin,Salarie salarie) {
	
		this.id_conge = id_conge;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.salarie = salarie;
		
	}
	public Conge(String date_debut, String date_fin,Salarie salarie) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.salarie =salarie;
	}
	
	public Conge() {
		super();
	}
	
	public int getId_conge() {
		return id_conge;
	}
	public void setId_conge(int id_conge) {
		this.id_conge = id_conge;
	}
	public String getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}
	public String getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}
	public Salarie getSalarie() {
		return salarie;
	}
	public void setSalarie(Salarie salarie) {
		this.salarie = salarie;
	}
	
	
	
}
