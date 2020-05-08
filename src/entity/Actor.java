package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	public Actor() {
	}
	
	public Actor(String name) {
		super();
		this.name = name;
	}

	@ManyToMany(mappedBy = "actor")
	private Set<Movie> movie = new HashSet<>();

	public void setMovie(Set<Movie> movie) {
		this.movie = movie;
	}

}
