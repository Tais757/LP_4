package ifms.aula;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public List<Todo> findAll() {
		return todoRepository.findAll();
	}

	@Override
	public void saveOrUpdate(Todo todo) {
		todoRepository.save(todo);
	}
	
	public void deleteById(String id) {
		todoRepository.deleteById(id);
	}

	@Override
	public Optional<Todo> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Todo todo) {
		// TODO Auto-generated method stub
		
	}

}
