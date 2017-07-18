package cloud.persei.stocky.server.model.music;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.users.User;

@Entity
public class Playlist {
	@Id
	private int ID;
	
	private List<Song> songs;
	private User user;
	private boolean library;
}
