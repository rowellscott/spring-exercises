package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private String leadActor;
	
	protected Movie() {}
	
	public Movie(String title, String leadActor) {
		this.title = title;
		this.leadActor = leadActor;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Movie[id=%d, title ='%s', leadActor = '%s']", id, title, leadActor);
				
	}
	
	
}
