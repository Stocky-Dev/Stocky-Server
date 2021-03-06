package cloud.persei.stocky.server.model.files;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quality {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Enumerated(EnumType.STRING)
	private FileType type;
	
	private String name;
	private Integer bitrate;
	
	public Quality() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public Integer getBitrate() {
		return bitrate;
	}
	
	public String getName() {
		return name;
	}
	
	public FileType getType() {
		return type;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(FileType type) {
		this.type = type;
	}
	
	public void setBitrate(Integer bitrate) {
		this.bitrate = bitrate;
	}
}
