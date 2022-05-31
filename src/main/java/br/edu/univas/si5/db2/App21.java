package br.edu.univas.si5.db2;

import javax.persistence.EntityManager;


import br.edu.univas.si5.bd2.utils.HibernateUtil;
import br.edu.univas.si5.db2.entities.Cargo;
import br.edu.univas.si5.db2.entities.TipoCargo;

/**
 * Hello world!
 *
 */
public class App21 
{
    public static void main( String[] args )
    {
    	
    	Cargo programador = new Cargo();
    	programador.setCodigo(35);
    	programador.setNome("Nutricionista");
    	programador.setSalario(30000f);
    	
    	programador.setType(TipoCargo.CLT);
    	
    	EntityManager em;
    	em = HibernateUtil.getEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(programador);
    	em.getTransaction().commit();
    	
    	
    	
    }


}
