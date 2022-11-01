package com.southpartk.ufro.repository;

import com.southpartk.ufro.model.PersonageSecundary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonageSecundaryRepository extends CrudRepository<PersonageSecundary, String> {
}
