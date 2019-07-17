package bananamen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlavnaKlasa {

	public static void main(String[] args) {
			
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
		
		HibernateMetode metode = c.getBean("hibernateMetode",HibernateMetode.class);
		
		SuperHeroj heroj = c.getBean("superHeroj", SuperHeroj.class);
		
		metode.ubaciSuperHerojaUbazu(heroj);
		System.out.println(metode.getHeroName(1));
		c.close();

	}

}
