package co.com.sofka.crud.controller;

import co.com.sofka.crud.model.ListModel;
import co.com.sofka.crud.repositories.ListRepository;
import co.com.sofka.crud.services.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class ListController {

    @Autowired
    ListService listService;

    @Autowired
    ListRepository listRepository;

    @GetMapping("/list")
    public ResponseEntity<List<ListModel>> getAll(){
        List<ListModel> allList = listService.getAllList();
        if (allList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(allList, HttpStatus.OK);
    }

    @PostMapping("/list")
    public ResponseEntity<ListModel> save(@RequestBody ListModel list){
        ListModel newList= listService.save(list);
        return new ResponseEntity<>(newList, HttpStatus.CREATED);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<ListModel> getById(@PathVariable("id") Long id){
        Optional<ListModel> listInfo = listRepository.findById(id);
        return new ResponseEntity<>(listInfo.get(), HttpStatus.OK);
    }



}
