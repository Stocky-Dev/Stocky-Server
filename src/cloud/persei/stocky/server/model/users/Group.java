package cloud.persei.stocky.server.model.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Group {
	@Id
	private int ID;
	
	private String name;
}
