package co.com.sofka.crud.controller;

import co.com.sofka.crud.services.TodoService;
import co.com.sofka.crud.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private TodoService todoService;

    /*@GetMapping(value = "/todos")
    public List<TodoDto> getAllTodo(){
        return todoService.getAllTodo();
    }*/
    
    @PostMapping(value = "api/todo")
    public Todo save(@RequestBody Todo todo){
        return todoService.save(todo);
    }

    @PutMapping(value = "api/todo")
    public Todo update(@RequestBody Todo todo){
        if(todo.getId() != null){
            return todoService.save(todo);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id")Long id){
        todoService.deleteById(id);
    }

    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable("id") Long id){
        return todoService.getById(id);
    }

}
