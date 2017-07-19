package cloud.persei.stocky.server.model.files;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class File {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private String path;
	private File derivation;
	private Quality quality;
	
	public File() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public String getPath() {
		return path;
	}
	
	public File getDerivation() {
		return derivation;
	}
	
	public Quality getQuality() {
		return quality;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void setDerivation(File derivation) {
		this.derivation = derivation;
	}
	
	public void setQuality(Quality quality) {
		this.quality = quality;
	}
}
