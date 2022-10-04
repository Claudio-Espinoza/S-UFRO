package com.southpartk.ufro.repository;

import com.southpartk.ufro.model.PersonajePrincipal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajePrincipalRepository extends CrudRepository<PersonajePrincipal, String> {
}
