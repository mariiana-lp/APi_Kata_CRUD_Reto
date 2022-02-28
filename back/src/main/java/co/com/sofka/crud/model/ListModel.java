package co.com.sofka.crud.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ListModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    //Relacion de listas y todo
    @OneToMany(mappedBy = "list", cascade = CascadeType.ALL, orphanRemoval= true, fetch = FetchType.EAGER)
    private Set<Todo> todo;

    //Constructores


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", todo=" + todo +
                '}';
    }
}
