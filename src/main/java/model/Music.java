package model;

import java.io.Serializable;
import java.util.Objects;

public class Music implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	private String author;
	private int style;
	private String album;
	private String link;
	
	public Music(int id, String title, String author, int style , String album, String link) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.style = style;
		this.album = album;
		this.link = link;
	}
	
	public Music() {};
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setStyle(int style) {
		this.style = style;
	}
	public int getStyle() {
		return this.style;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	public String getLink() {
		return this.link;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return id == other.id;
	}
}
