package todolist.todo;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
@Service
public class ToDoService {

public List<ToDo> todos=new ArrayList<>(
		
		Arrays.asList(
				
				new ToDo(1,"task_1","sumarry","desc_1"),
				new ToDo(2,"task_2","sumarry","desc_2"),
				new ToDo(3,"task_3","sumarry","desc_3"),
				new ToDo(4,"task_4","sumarry","desc_4")
				
				)
		
		);

public List<ToDo> getAllToDos(){
	return todos;
}

public ToDo getTodo( Integer id){
	return todos.stream().filter(p->p.getId().equals(id)).findFirst().get();
	
}

public void createToDo(ToDo todo) {
	// TODO Auto-generated method stub
	todos.add(todo);
}


}
