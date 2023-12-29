package model;

import java.io.Serializable;
import java.util.Objects;

public class Music implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	private String author;
	private String album;
	
	public Music(int id, String title, String author, String album) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.album = album;
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
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
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
