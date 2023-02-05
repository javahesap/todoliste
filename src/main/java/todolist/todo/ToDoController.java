package todolist.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Controller

public class ToDoController {
	
	@Autowired
	private ToDoService toDoService;
	@RequestMapping("/todos")
	
	public List<ToDo> getAllTodos(){
		
		
		return toDoService.getAllToDos();
		
		
	}

	
@RequestMapping("/todos/{id}")
	
	public ToDo getTodo(@PathVariable Integer id){
		
		
		return toDoService.getTodo(id);
		
		
	}
}
