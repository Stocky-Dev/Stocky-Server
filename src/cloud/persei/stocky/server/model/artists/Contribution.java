package cloud.persei.stocky.server.model.artists;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contribution {
	@Id
	private int ID;
	
	private Artist artist;
	private ContributionType type;
}
