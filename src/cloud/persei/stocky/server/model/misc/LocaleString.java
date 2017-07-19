package cloud.persei.stocky.server.model.misc;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LocaleString {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private String name;
	private Map<Language, String> strings;
	
	public LocaleString() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Map<Language, String> getStrings() {
		return strings;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStrings(Map<Language, String> strings) {
		this.strings = strings;
	}
}
