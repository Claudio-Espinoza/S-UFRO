package com.southpartk.ufro.service;

import com.southpartk.ufro.model.Admin;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    boolean existsById(String rut);

}
