package cloud.persei.stocky.server.model.artists;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Collective extends Artist {
	private List<Artist> members;
}
