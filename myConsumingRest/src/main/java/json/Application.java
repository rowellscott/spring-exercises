package json;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

//	public static void main(String[] args) {
//		RestTemplate restTemplate = new RestTemplate();
//		Pokemon pokemon = restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon/5/", Pokemon.class);
//		log.info(pokemon.toString());
//	
//	}
		
	
	 public static void main(String args[]) {
			SpringApplication.run(Application.class);
		}
	 
	 @Bean 
	 public RestTemplate restTemplate(RestTemplateBuilder builder) {
		 return builder.build();
	 }
	 
	 @Bean
	 public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		 return args -> {
			 
			 Random rand = new Random();
				int value =rand.nextInt(49) +1;
				String number = Integer.toString(value);
	
			 Pokemon pokemon = restTemplate.getForObject(
					 "https://pokeapi.co/api/v2/pokemon/" + number + "/", Pokemon.class);
			 log.info("Pokemon Data ----------------------------------------");
			 log.info(pokemon.toString());
					 
		 };
	 }


}
