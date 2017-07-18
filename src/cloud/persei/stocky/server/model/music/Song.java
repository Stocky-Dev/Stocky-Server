package cloud.persei.stocky.server.model.music;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.artists.Contribution;
import cloud.persei.stocky.server.model.files.File;

@Entity
public class Song {
	@Id
	private int ID;
	
	private String name;
	private boolean meta;
	private Integer length;
	
	private List<File> files;
	
	private List<Contribution> contributions;
}
