package todolist.todo;



import javax.persistence.*;
@Table(name="todo")
@Entity
public class ToDo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
Integer id;
String name;
String sumary;
String decripton;

public ToDo() {
	
}


public ToDo(Integer id, String name, String sumary, String decripton) {
	super();
	this.id = id;
	this.name = name;
	this.sumary = sumary;
	this.decripton = decripton;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSumary() {
	return sumary;
}
public void setSumary(String sumary) {
	this.sumary = sumary;
}
public String getDecripton() {
	return decripton;
}
public void setDecripton(String decripton) {
	this.decripton = decripton;
}


}
