package data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public CommandLineRunner demo(MovieRepository repository) {
		return (args) -> {
			repository.save(new Movie("Mission Impossible", "Tom Cruise"));
			repository.save(new Movie("Shawshank Redemption", "Tim Robbins"));
			repository.save(new Movie("Dumb and Dumber", "Jim Carrey"));
			repository.save(new Movie("Top Gun", "Tom Cruise"));
			
			log.info("All Movies in the Database");
			log.info("-----------------------------------");
			for(Movie movie: repository.findAll()) {
				log.info(movie.toString());
			}
			log.info("");
			
			
			repository.findById(3L)
			.ifPresent(movie -> {
				log.info("Movie with Id 3");
				log.info("-----------------------------------");
				log.info(movie.toString());
				log.info("");
			});
			
			log.info("Movies in the Database with Tom Cruise as Lead Actor");
			log.info("-----------------------------------");
			repository.findByLeadActor("Tom Cruise").forEach(movie -> 
			log.info(movie.toString()));
			log.info("");
			
		};
	}

}
