package com.car.car.repository;

import com.car.car.entity.Car;
import com.car.car.entity.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findByid(Integer id);
}
