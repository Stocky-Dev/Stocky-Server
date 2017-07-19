package cloud.persei.stocky.server.model.misc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Property {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private PropertyType type;
	private LocaleString value;
	
	public Property() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public PropertyType getType() {
		return type;
	}
	
	public LocaleString getValue() {
		return value;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setType(PropertyType type) {
		this.type = type;
	}
	
	public void setValue(LocaleString value) {
		this.value = value;
	}
}
