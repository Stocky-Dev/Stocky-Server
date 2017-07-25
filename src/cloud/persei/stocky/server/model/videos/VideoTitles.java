package cloud.persei.stocky.server.model.videos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import cloud.persei.stocky.server.model.artists.Contribution;
import cloud.persei.stocky.server.model.files.File;
import cloud.persei.stocky.server.model.misc.Language;
import cloud.persei.stocky.server.model.misc.Property;

@Entity
public class VideoTitles {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	private String name;
	private int length;

	private List<Property> properties;
	private List<Contribution> contributions;

	private List<File> files;

	private List<Subtitle> subtitles;

	private Language language;

	public VideoTitles() {
		// JPA
	}

	public int getId() {
		return id;
	}

	public List<Contribution> getContributions() {
		return contributions;
	}

	public List<File> getFiles() {
		return files;
	}

	public Language getLanguage() {
		return language;
	}

	public int getLength() {
		return length;
	}

	public String getName() {
		return name;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public List<Subtitle> getSubtitles() {
		return subtitles;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	public void setSubtitles(List<Subtitle> subtitles) {
		this.subtitles = subtitles;
	}
}
