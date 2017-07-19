package cloud.persei.stocky.server.model.music;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.users.User;

@Entity
public class Playlist {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private List<Song> songs;
	private User user;
	private boolean library;
	
	public Playlist(){
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public User getUser() {
		return user;
	}
	
	public List<Song> getSongs() {
		return songs;
	}
	
	public boolean isLibrary() {
		return library;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setLibrary(boolean library) {
		this.library = library;
	}
	
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
