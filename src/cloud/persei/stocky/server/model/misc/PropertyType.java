package cloud.persei.stocky.server.model.misc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PropertyType {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private LocaleString name;
	private LocaleString description;
	
	public PropertyType() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public LocaleString getName() {
		return name;
	}
	
	public LocaleString getDescription() {
		return description;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(LocaleString name) {
		this.name = name;
	}
	
	public void setDescription(LocaleString description) {
		this.description = description;
	}
}
