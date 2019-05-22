package bananamen;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		String heroName = "Spajdermen";
		String magic = "Baci mrezu";
		
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
		
		HibernateMetode metode = c.getBean("hibernateMetode",HibernateMetode.class);
		
		//metode.ubaciSuperHerojaUbazu(heroName, magic);
		System.out.println(metode.getHeroName(1));
		c.close();

	}

}
