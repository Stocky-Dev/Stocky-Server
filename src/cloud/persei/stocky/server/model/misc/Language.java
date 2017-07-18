package cloud.persei.stocky.server.model.misc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {
	@Id
	private int ID;
	
	private String name;
	private String contraction;
}
