package entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
			name = "movie_actor",
			joinColumns = {@JoinColumn(name="movie_id")},
			inverseJoinColumns = {@JoinColumn(name="actor_id")}
			)
	private Set<Actor> actor = new HashSet<>();

	public Movie() {
	}
	public Movie(String name) {
		super();
		this.name= name;
		// TODO Auto-generated constructor stub
	}

	public Set<Actor> getActor() {
		return actor;
	}


	
}
