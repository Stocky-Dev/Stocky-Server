package cloud.persei.stocky.server.model.videos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.artists.Contribution;
import cloud.persei.stocky.server.model.images.Image;
import cloud.persei.stocky.server.model.misc.Language;

@Entity
public class Video {
	@Id
	private int ID;
	
	private Video derivate;
	
	private Language originalLanguage;
	
	private List<Contribution> contributions;
	
	private List<VideoTitles> titles;
	
	private Image previewImage;
}
