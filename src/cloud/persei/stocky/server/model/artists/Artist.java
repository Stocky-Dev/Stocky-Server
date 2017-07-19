package cloud.persei.stocky.server.model.artists;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.images.Image;
import cloud.persei.stocky.server.model.misc.Property;

@Entity
public class Artist {
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE)
	private int id;
	
	private List<Property> properties;
	
	private Image image;
	
	private String name;
	private String description;
	
	public Artist() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public List<Property> getProperties() {
		return properties;
	}
	
	public String getName() {
		return name;
	}
	
	public Image getImage() {
		return image;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setImage(Image image) {
		this.image = image;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
}
