package todolist.todo;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
@Service

public class ToDoService {

/*public List<ToDo> todos=new ArrayList<>(
		
		Arrays.asList(
				
				new ToDo(1,"task_1","sumarry","desc_1"),
				new ToDo(2,"task_2","sumarry","desc_2"),
				new ToDo(3,"task_3","sumarry","desc_3"),
				new ToDo(4,"task_4","sumarry","desc_4")
				
				)
		
		);*/

@Autowired
private ToDoRepository toDoRepository;

public List<ToDo> getAllToDos(){
	List<ToDo> todos=new ArrayList<>();
	
	toDoRepository.findAll().forEach(todos::add);
	return todos;
}

public Optional<ToDo> getTodo( Integer id){
	//return todos.stream().filter(p->p.getId().equals(id)).findFirst().get();
	return toDoRepository.findById(id);
	
}

public void createToDo(ToDo todo) {
	// TODO Auto-generated method stub
	//todos.add(todo);
	toDoRepository.save(todo);
}

public  void updateToDo(Integer id,ToDo todo) {
	// TODO Auto-generated method stub
	/*for(int i=0;i<todos.size();i++) {
		ToDo t =todos.get(i);
		if(t.getId().equals(id)) {
			
			todos.set(i, todo);
			return;
		}
		
	}*/
	toDoRepository.save(todo);
}


public  void deleteToDo(Integer id) {
	// TODO Auto-generated method stub
	//todos.removeIf(q->q.getId().equals(id));
	toDoRepository.deleteById(id);;
}





}
