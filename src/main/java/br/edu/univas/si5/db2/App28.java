package br.edu.univas.si5.db2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.db2.entities.Department;
import br.edu.univas.si5.db2.entities.Funcionario;

public class App28 {
	
	public static void main(String[] args) {
		
		String name = ("MICHEL DIFERENCIDADO");
		String sexo = ("M");
		Date nascimento = new Date();
		
		Funcionario fun = new Funcionario();
		EntityManager em = HibernateUtil.getEntityManager();
		
		fun.setNome(name);
		fun.setIdade(20);
		fun.setNascimento(nascimento);
		
		fun.setSexo(sexo);
		
		em.getTransaction().begin();
		em.persist(fun);
		em.getTransaction().commit();
	}
	
}
