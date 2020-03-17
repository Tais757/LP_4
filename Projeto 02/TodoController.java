package ifms.aula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/javatodos")

public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping(value = "/")
	public List<Todo> getALL(){
		return todoService.findAll();
	}
}
