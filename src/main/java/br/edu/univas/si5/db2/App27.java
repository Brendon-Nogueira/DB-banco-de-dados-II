package br.edu.univas.si5.db2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.db2.entities.Funcionario;

public class App27 {
	public static void main(String[] args) {
		
		
		Funcionario func = new Funcionario();
		EntityManager em = HibernateUtil.getEntityManager();
			
		func.setNome("Robertinho");
		func.setSexo("M");
		
		em.getTransaction().begin();
		em.persist(func);
		em.getTransaction().commit();
	}
	}

