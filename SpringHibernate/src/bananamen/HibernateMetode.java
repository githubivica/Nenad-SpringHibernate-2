package bananamen;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateMetode {
	@Autowired
	private SessionFactory sf;
	
	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public void ubaciSuperHerojaUbazu(String heroName, String magic) {
		
		SuperHeroj sh = new SuperHeroj();
			sh.setHeroName(heroName);
			sh.setMagic(magic);
		Session session = sf.openSession();
			session.beginTransaction();
			try {
				session.save(sh);
				session.getTransaction().commit();
				System.out.println("Uspeo sam!!!!");
			} catch (Exception e) {
				session.getTransaction().rollback();
				System.out.println("Nije uspeo upis u bazu");
			}finally {
				session.close();
			}
		
	}
	
	public String getHeroName(int idHero) {
		String hql = "SELECT heroName FROM SuperHeroj WHERE idHero = :id";
		Query query = sf.openSession().createQuery(hql);
		query.setParameter("id", idHero);
		return (String)query.getResultList().get(0);
	}
	
	
	
}
