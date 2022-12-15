package com.southpartk.ufro.service;

import com.southpartk.ufro.repository.PointRepository;
    import org.springframework.stereotype.Service;

@Service
public class PointService {

    final
    PointRepository pointRepository;

    public PointService(PointRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    public int multiplyPoints(int pointToAssert, int level){
        return pointToAssert * getMultiplyPointLevel(level);
    }

    public int getMultiplyPointLevel(int actualyLevel) {
        if (actualyLevel >= 2) {
            return 2;
        } else {
            return 1;
        }
    }

    public int calculatePointForLevel(int level){
        return 100*level;
    }

}
