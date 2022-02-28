package co.com.sofka.crud.services;

import co.com.sofka.crud.model.ListModel;
import co.com.sofka.crud.repositories.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class ListService {
    @Autowired
    ListRepository listRepository;

    public ArrayList<ListModel> getAllList(){
        return (ArrayList<ListModel>) listRepository.findAll();
    }

    public ListModel save(ListModel list){
        return listRepository.save(list);
    }

    public Optional<ListModel> getById(Long id){
        return listRepository.findById(id);
    }


    public void deleteById(Long id){
        listRepository.deleteById(id);
    }
}

