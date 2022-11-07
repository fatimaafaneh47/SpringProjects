package com.codingdojo.dojoninja.reposotories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojoninja.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
	
}


