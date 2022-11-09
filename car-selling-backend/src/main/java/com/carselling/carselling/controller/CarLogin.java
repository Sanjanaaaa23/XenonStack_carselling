package com.carselling.carselling.controller;

import com.carselling.carselling.Entity.Car;
import com.carselling.carselling.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CarLogin {
    @Autowired
    private CarService carService;
    @GetMapping(value = "/login/{id}/{pass}")
    public Optional<Car> login(@PathVariable String id, @PathVariable String pass)
    {
      return carService.login(Integer.valueOf(id),pass);
    }
}
