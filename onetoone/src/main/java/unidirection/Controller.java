package unidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		unidirectional one to one mapping
		Person p=new Person();
		p.setP_id(94125);
		p.setName("varsha");
		p.setPhone(456790);
		
		Pancard pa=new Pancard();
		pa.setPan_id(4567);
		pa.setName("harsha");
		pa.setDepartment(34567890);
		
		
		
//		Link both
		pa.setPe(p);
		
		et.begin();
		em.persist(p);
		em.persist(pa);
		et.commit();
		System.out.println("unidirection mapping of onetoone is done");
		}

}
