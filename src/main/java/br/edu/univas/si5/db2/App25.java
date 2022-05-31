package br.edu.univas.si5.db2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.db2.entities.Department;


public class App25 {
	public static void main(String[] args) {
		
		String name = "TI";
		Department dp = new Department();
		EntityManager em = HibernateUtil.getEntityManager();
		
		dp.setName(name);
		
		em.getTransaction().begin();
		em.persist(dp);
		em.getTransaction().commit();
	}
	
	
}
