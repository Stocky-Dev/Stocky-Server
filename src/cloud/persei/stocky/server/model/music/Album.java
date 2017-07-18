package cloud.persei.stocky.server.model.music;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.artists.Artist;
import cloud.persei.stocky.server.model.images.Image;
import cloud.persei.stocky.server.model.misc.Property;

@Entity
public class Album {
	@Id
	private int ID;
	
	private String name;
	private List<Song> songs;

	private List<Property> properties;
	private Image cover;
	
	private Artist artist;
	private Artist label;
}
