package model;

import java.io.Serializable;
import java.util.Objects;

public class Playlist implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	
	public Playlist(int id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public Playlist() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Playlist other = (Playlist) obj;
		return id == other.id && Objects.equals(title, other.title);
	}
}
