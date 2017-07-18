package cloud.persei.stocky.server.model.files;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quality {
	@Id
	private int ID;
	
	private String name;
	private FileType type;
	private Integer bitrate;
}
