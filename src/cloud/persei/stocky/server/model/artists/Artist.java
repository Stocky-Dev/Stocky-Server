package cloud.persei.stocky.server.model.artists;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.images.Image;
import cloud.persei.stocky.server.model.misc.Property;

@Entity
public class Artist {
	@Id
	private int ID;
	
	private List<Property> properties;
	
	private Image image;
	
	private String name;
	private String description;
}
