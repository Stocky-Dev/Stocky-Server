package cloud.persei.stocky.server.model.files;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class File {
	@Id
	private int ID;
	
	private String path;
	private File derivation;
	private Quality quality;
}
