package data;

public class Movie {
	private long id;
	private String title;
	private String leadActor;
	
	Movie(long id, String title, String leadActor){
		this.id = id;
		this.title = title;
		this.leadActor = leadActor;
	}
	
	@Override 
	public String toString(){
		return String.format("Movie[id=%d, title='%s', leadActor ='%s'", id, title, leadActor);
	}
}
