package cloud.persei.stocky.server.model.misc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Property {
	@Id
	private int ID;
	
	private PropertyType type;
	private String value;
}
