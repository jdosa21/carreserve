package com.car.car.service;

import com.car.car.entity.Car;
import com.car.car.entity.Reserve;
import com.car.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public List<Car> carList(){
        return carRepository.findAll();
    }

    public Car carView(Integer id) {

        return carRepository.findByid(id); // id 값을 받아온다.
    }

    public void create(Car car){
        carRepository.save(car);
    }
}
