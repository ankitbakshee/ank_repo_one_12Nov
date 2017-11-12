package com.boot.ankit.firstbootapp;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.ankit.entity.Test_Data;

@Repository
public interface TestRepository extends CrudRepository<Test_Data, Integer> {

}
