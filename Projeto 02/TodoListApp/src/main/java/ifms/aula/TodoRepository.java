package ifms.aula;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
	
	List<Todo> findAll();
}
