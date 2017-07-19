package cloud.persei.stocky.server.model.music;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.artists.Contribution;
import cloud.persei.stocky.server.model.files.File;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	private String name;
	private boolean meta;
	private Integer length;

	private List<File> files;

	private List<Contribution> contributions;

	public Song() {
		// JPA
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<File> getFiles() {
		return files;
	}
	
	public List<Contribution> getContributions() {
		return contributions;
	}
	
	public Integer getLength() {
		return length;
	}
	
	public boolean isMeta() {
		return meta;
	}
	
	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}
	
	public void setFiles(List<File> files) {
		this.files = files;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setLength(Integer length) {
		this.length = length;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMeta(boolean meta) {
		this.meta = meta;
	}
}
