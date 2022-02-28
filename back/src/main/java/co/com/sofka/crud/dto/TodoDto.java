package co.com.sofka.crud.dto;

public class TodoDto {

    private Long idTodo;
    private String name_Todo;
    private  boolean iscomplate;
    private Long idList;

    public Long getIdTodo() {
        return idTodo;
    }

    public void setIdTodo(Long idTodo) {
        this.idTodo = idTodo;
    }

    public String getName_Todo() {
        return name_Todo;
    }

    public void setName_Todo(String name_Todo) {
        this.name_Todo = name_Todo;
    }

    public boolean isIscomplate() {
        return iscomplate;
    }

    public void setIscomplate(boolean iscomplate) {
        this.iscomplate = iscomplate;
    }

    public Long getIdList() {
        return idList;
    }

    public void setIdList(Long idList) {
        this.idList = idList;
    }
}
