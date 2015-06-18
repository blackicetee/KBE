package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;
import java.lang.reflect.Field;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ToDoListMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private String testMessage = "Dies ist ein Test";
    private ToDoList toDoList;
    
	public ToDoListMB() {
		super();
		this.toDoList = new ToDoList();
	}    
	
	public ToDoList getToDoList(){
		return this.toDoList;
	}

    public String save() {
    	return "save";
    }
    
    public String getTestMessage(){
		return this.testMessage;
	}
}
