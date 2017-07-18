package cloud.persei.stocky.server.model.videos;

import javax.persistence.Entity;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.files.File;
import cloud.persei.stocky.server.model.misc.Language;

@Entity
public class Subtitle {
	@Id
	private int ID;
	
	private Language language;
	private File file;
}
