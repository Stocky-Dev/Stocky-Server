package cloud.persei.stocky.server.model.misc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Language {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private String name;
	private String contraction;
	
	public Language() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public String getContraction() {
		return contraction;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setContraction(String contraction) {
		this.contraction = contraction;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
