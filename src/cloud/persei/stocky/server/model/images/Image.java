package cloud.persei.stocky.server.model.images;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.files.File;

@Entity
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private String name;
	private String description;
	private List<File> files;
	
	public Image() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public List<File> getFiles() {
		return files;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFiles(List<File> files) {
		this.files = files;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
