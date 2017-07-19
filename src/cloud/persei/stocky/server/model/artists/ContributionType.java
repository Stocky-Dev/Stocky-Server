package cloud.persei.stocky.server.model.artists;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.misc.LocaleString;

@Entity
public class ContributionType {
 
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE)
	private int id;
	
	private LocaleString name;
	private LocaleString description;
	
	public ContributionType() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public LocaleString getName() {
		return name;
	}
	
	public LocaleString getDescription() {
		return description;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(LocaleString name) {
		this.name = name;
	}
	
	public void setDescription(LocaleString description) {
		this.description = description;
	}
}
