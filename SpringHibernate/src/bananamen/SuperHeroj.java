package bananamen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
public class SuperHeroj {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHero;
	@Value("${superheroj.ime}")
	private String heroName;
	@Value("superheroj.magija")
	private String magic;
	
	
	public int getIdHero() {
		return idHero;
	}
	public void setIdHero(int idHero) {
		this.idHero = idHero;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getMagic() {
		return magic;
	}
	public void setMagic(String magic) {
		this.magic = magic;
	}
	
	

}
