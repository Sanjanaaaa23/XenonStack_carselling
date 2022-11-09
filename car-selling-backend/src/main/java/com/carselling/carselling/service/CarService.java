package com.carselling.carselling.service;

import com.carselling.carselling.Entity.Car;
import com.carselling.carselling.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    public Optional<Car> login(Integer id , String pass)
    {
       return carRepository.findById(id);
    }
}
