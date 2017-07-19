package cloud.persei.stocky.server.model.music;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.artists.Artist;
import cloud.persei.stocky.server.model.images.Image;
import cloud.persei.stocky.server.model.misc.Property;

@Entity
public class Album {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private String name;
	private List<Song> songs;

	private List<Property> properties;
	private Image cover;
	
	private Artist artist;
	private Artist label;
	
	public Album(){
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public Artist getArtist() {
		return artist;
	}
	
	public Image getCover() {
		return cover;
	}
	
	public Artist getLabel() {
		return label;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Property> getProperties() {
		return properties;
	}
	
	public List<Song> getSongs() {
		return songs;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	public void setCover(Image cover) {
		this.cover = cover;
	}
	
	public void setLabel(Artist label) {
		this.label = label;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
	
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
}
