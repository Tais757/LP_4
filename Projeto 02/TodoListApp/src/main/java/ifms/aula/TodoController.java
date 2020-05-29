package ifms.aula;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/javatodos")

public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@CrossOrigin
	@GetMapping(value = "/")
	public List<Todo> getALLTodos(){
		return todoService.findAll();
	}
	
	@CrossOrigin
	@PostMapping(value = "/")
	public ResponseEntity<?> saveOrUpdate(@RequestBody Todo todo){
		todoService.saveOrUpdate(todo);
		return new ResponseEntity<>("Student added susessfully", HttpStatus.OK);
	}
	
	@CrossOrigin
    @PutMapping(value = "/{id}")
    public ResponseEntity<Todo> Put(@PathVariable(value = "id") String id, @Valid @RequestBody Todo newTodo)
    {
        Optional<Todo> update = todoService.findById(id);
        if(update.isPresent()){
            Todo todo = update.get();
            todo.setDescription(newTodo.getDescription());
            todoService.save(todo);
            return new ResponseEntity<Todo>(todo, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
	
	/*@CrossOrigin
    @PutMapping(value = "/")
    public ResponseEntity<?> update(@RequestBody Todo todo) {
        todoService.save(todo);
        return new ResponseEntity<>(HttpStatus.OK);
    }*/
	
	@CrossOrigin
	@DeleteMapping("/{id}")
	ResponseEntity<?> deleteTodo(@PathVariable String id) {
		todoService.deleteById(id);
		//return ResponseEntity.noContent().build();
        return new ResponseEntity<>(HttpStatus.OK);
	}
}
