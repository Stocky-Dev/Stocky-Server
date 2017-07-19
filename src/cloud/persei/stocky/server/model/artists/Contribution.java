package cloud.persei.stocky.server.model.artists;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contribution {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	private Artist artist;
	private ContributionType type;

	public Contribution() {
		// JPA
	}

	public int getId() {
		return id;
	}

	public Artist getArtist() {
		return artist;
	}

	public ContributionType getType() {
		return type;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public void setType(ContributionType type) {
		this.type = type;
	}
}
