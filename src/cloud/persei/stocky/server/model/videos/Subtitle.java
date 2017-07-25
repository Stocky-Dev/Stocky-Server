package cloud.persei.stocky.server.model.videos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.files.File;
import cloud.persei.stocky.server.model.misc.Language;

@Entity
public class Subtitle {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private Language language;
	private File file;
	
	public Subtitle() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public File getFile() {
		return file;
	}
	
	public Language getLanguage() {
		return language;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFile(File file) {
		this.file = file;
	}
	
	public void setLanguage(Language language) {
		this.language = language;
	}
}
