package cloud.persei.stocky.server.model.videos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.artists.Contribution;
import cloud.persei.stocky.server.model.files.File;
import cloud.persei.stocky.server.model.misc.Language;
import cloud.persei.stocky.server.model.misc.Property;

@Entity
public class VideoTitles {
	@Id
	private int ID;
	
	private String name;
	private int length;
	
	private List<Property> properties;
	private List<Contribution> contributions; 
	
	private List<File> files;
	
	private List<Subtitle> subtitles;
	
	private Language language;
	
}
