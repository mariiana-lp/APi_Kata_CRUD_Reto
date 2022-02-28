package co.com.sofka.crud.services;

import co.com.sofka.crud.dto.TodoDto;
import co.com.sofka.crud.repositories.TodoRepository;
import co.com.sofka.crud.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void getAllTodo(){
        // todoRepository.findAll().stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }

    private TodoDto convertEntityToDto(Todo todo){
        TodoDto todoDto = new TodoDto();

        todoDto.setIdTodo(todo.getId());
        todoDto.setIscomplate(todo.isCompleted());
        todoDto.setName_Todo(todo.getName());
        todoDto.setIdList(todo.getList().getId());
        return todoDto;
    }

    public Iterable<Todo> list(){
        return todoRepository.findAll();
    }

    public Todo save(Todo todo){
        return todoRepository.save(todo);
    }

    public void deleteById(Long id){
        todoRepository.delete(getById(id));
    }

    public Todo getById(Long id){
         return todoRepository.findById(id).orElseThrow();
    }

}
