package com.application.repository;

import com.application.entities.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface MakerRepository extends CrudRepository<Maker, Long> {

}
