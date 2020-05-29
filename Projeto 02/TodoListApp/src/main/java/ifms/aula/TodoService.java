package ifms.aula;

import java.util.List;
import java.util.Optional;

public interface TodoService {
	List<Todo> findAll();
	void saveOrUpdate(Todo todo);
	void deleteById(String id);
	void save(Todo todo);
	Optional<Todo> findById(String id);
}
