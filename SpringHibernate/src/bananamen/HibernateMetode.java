package bananamen;

import javax.persistence.Query;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateMetode {
	
	@Autowired
	private SessionFactory sessionFactory;
	


	@Transactional
	public String getHeroName(int idHero) {
		String hql = "SELECT heroName FROM SuperHeroj WHERE idHero = :id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("id", idHero);
		return (String)query.getResultList().get(0);
	}
	
	@Transactional
	public void ubaciSuperHerojaUbazu(SuperHeroj heroj) {
	
		sessionFactory.getCurrentSession().save(heroj);
	}
	
	
}
