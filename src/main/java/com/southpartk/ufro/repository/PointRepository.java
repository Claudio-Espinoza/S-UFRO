package com.southpartk.ufro.repository;

import com.southpartk.ufro.model.Point;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends CrudRepository<Point, Integer> {
}
