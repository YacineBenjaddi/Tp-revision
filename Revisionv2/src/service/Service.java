package service;

import java.util.LinkedList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import bean.Conge;
import bean.Salarie;

import util.HibernateUtil;




public class Service {
	
		
     
	 public static List<Salarie> getAllSalarie(){
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			List<Salarie> ls = new LinkedList<Salarie>();
			return session.createQuery("from Salarie").list();
		}
	 
	 public static boolean AddConge(String date_debut, String date_fin,Integer id_salarie){
		 boolean res = false;
			
			Salarie s = getOneSalarieById(id_salarie); 
			
			Conge c = new Conge(date_debut,date_fin,s);
			s.getConge().add(c);
			
			try{
				Session session = HibernateUtil.getSessionFactory().getCurrentSession();
				session.beginTransaction();
				session.save(s);
				session.save(c);
				session.getTransaction().commit();
				System.out.println("conge enregistré de salarie "+s.nom+"de date " + c.date_debut+"vers"+c.date_fin);
				res = true;
			}catch(Exception e){
				res = false;
				e.printStackTrace();
			}
			return res;
		}
	 
	 public static Salarie getOneSalarieById(int id_salarie){
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Criteria cr = session.createCriteria(Salarie.class);
			cr.add(Restrictions.like("id_salarie", "%"+ id_salarie +"%"));
		//	cr.add(Restrictions.le("id", 1));
			List<Salarie> l = cr.list();
			return l.get(0);
		}
}