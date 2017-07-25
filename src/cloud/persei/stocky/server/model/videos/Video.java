package cloud.persei.stocky.server.model.videos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.artists.Contribution;
import cloud.persei.stocky.server.model.images.Image;
import cloud.persei.stocky.server.model.misc.Language;

@Entity
public class Video {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	private Video derivate;
	private Language originalLanguage;
	private List<Contribution> contributions;
	private List<VideoTitles> titles;
	private Image previewImage;
	
	public Video() {
		// JPA
	}
	
	public int getId() {
		return id;
	}
	
	public List<Contribution> getContributions() {
		return contributions;
	}
	
	public Video getDerivate() {
		return derivate;
	}
	
	public Language getOriginalLanguage() {
		return originalLanguage;
	}
	
	public Image getPreviewImage() {
		return previewImage;
	}
	
	public List<VideoTitles> getTitles() {
		return titles;
	}
	
	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}
	
	public void setDerivate(Video derivate) {
		this.derivate = derivate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setOriginalLanguage(Language originalLanguage) {
		this.originalLanguage = originalLanguage;
	}
	
	public void setPreviewImage(Image previewImage) {
		this.previewImage = previewImage;
	}
	
	public void setTitles(List<VideoTitles> titles) {
		this.titles = titles;
	}
}
