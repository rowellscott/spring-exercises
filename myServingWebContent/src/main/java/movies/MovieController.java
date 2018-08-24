package movies;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MovieController {
	
	@GetMapping("/movie")
	public String movie(@RequestParam(name="name", required=false, defaultValue="Enter a movie into the variable name in the query string or go to 'movie/1 or 'movie/2'") String name, Model model) {
		model.addAttribute("name", name);
		return "movie";
	}
	
	@GetMapping("/movie/{id}")
	public String movie(@RequestParam(name="name", required=false, defaultValue="Mission Impossible") String name, Model model, @PathVariable Integer id) {
		if(id==1) {
			model.addAttribute("name", "Top Gun");
			return "movie";
		} else if (id == 2) {
			model.addAttribute("name", "Jerry Maguire");
			return "movie";
		} else {
			model.addAttribute("name", name);
			return "movie";
		}
	}
}
