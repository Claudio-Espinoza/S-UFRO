package com.southpartk.ufro.repository;

import com.southpartk.ufro.model.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends CrudRepository<Character, String> {
}
