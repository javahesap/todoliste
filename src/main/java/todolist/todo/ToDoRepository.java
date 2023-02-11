package todolist.todo;

import java.beans.JavaBean;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component 
@Repository
public interface ToDoRepository extends CrudRepository<ToDo,Integer> {

	
	
	
}
