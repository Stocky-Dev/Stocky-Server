package cloud.persei.stocky.server.model.images;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.files.File;

@Entity
public class Image {
	@Id
	private int ID;
	
	private String name;
	private String description;
	private List<File> files;
}
