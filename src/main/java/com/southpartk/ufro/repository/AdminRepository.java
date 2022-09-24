package com.southpartk.ufro.repository;

import com.southpartk.ufro.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, String> {

}
