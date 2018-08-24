package app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {
	
	@RequestMapping("/")
	public String index() {
		return "Hello from Index!";
	}
	
	@RequestMapping("/dogs")
	public String dogs() {
		return "Hello from Dogs!";
	}
	
}
