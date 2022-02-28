package co.com.sofka.crud.repositories;

import co.com.sofka.crud.model.ListModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ListRepository extends JpaRepository<ListModel, Long> {
}
