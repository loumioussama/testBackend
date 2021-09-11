package com.example.Fizzbuzz.controllers;

import com.example.Fizzbuzz.services.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class FizzBuzzController {

    @Autowired
    FizzBuzzService fizzBuzzService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity getFizzBuzz(@RequestParam(value = "input") int input){
        if(input <= 0){
            Map<String,String> error = new HashMap<>();
            error.put("error","Input can't be a negative number!");
            return ResponseEntity.badRequest().body(error);
        }
        return ResponseEntity.ok(fizzBuzzService.findFizzBuzz(input));
    }

}
