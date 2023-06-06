package com.example.jsoupspring.repository;


import com.example.jsoupspring.dao.JsoupEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface JsoupRepository extends CrudRepository<JsoupEntity, Long> {
    JsoupEntity findById(long id);

    ArrayList<JsoupEntity> findAll();
}
