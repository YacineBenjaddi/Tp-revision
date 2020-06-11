package action;

import java.util.LinkedList;

import bean.Salarie;

import service.Service;

public class Action {
public String date_debut,date_fin;
public int id_salarie;
public LinkedList<Salarie> l;
	public String Add(){
		String resultat = "success"; 
		// recuperation des parametres 
		String date_debut = this.getDate_debut();
		String date_fin = this.getDate_fin();
		int id_salarie = this.getId_salarie();
		
		// appel du service 
		//boolean res = Service.addConge(date_debut,date_fin,id_salarie);
		boolean res = Service.AddConge(date_debut,date_fin,id_salarie);
		if (res == false)
			resultat = "failure";
		
		return resultat; 
	}

	public String listerAllSelarieAction(){
		String resultat = "success"; 
		// invoquer le service 
	LinkedList<Salarie> lp = (LinkedList<Salarie>) Service.getAllSalarie();
		// envoyer vers vue
		this.setL(lp);
		return resultat;
		
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

	public int getId_salarie() {
		return id_salarie;
	}

	public void setId_salarie(int id_salarie) {
		this.id_salarie = id_salarie;
	}

	public LinkedList<Salarie> getL() {
		return l;
	}

	public void setL(LinkedList<Salarie> l) {
		this.l = l;
	}
	
	
}
