package com.southpartk.ufro.repository;

import com.southpartk.ufro.model.Personage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonageRepository extends CrudRepository<Personage, String> {
}
