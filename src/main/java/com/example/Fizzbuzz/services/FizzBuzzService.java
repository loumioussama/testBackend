package com.example.Fizzbuzz.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FizzBuzzService {

    public Map<Integer,String> findFizzBuzz(int value){
        if(value <= 0) return null;
        Map<Integer,String> result = new HashMap<>();
        for (int i = 1; i <=value; i++) {
            if(i % 15 == 0) {
                result.put(i,"FizzBuzz");
            }
            else if(i % 5 == 0) {
                result.put(i,"Buzz");
            }
            else if(i % 3 == 0) {
                result.put(i,"Fizz");
            }
        }
        return result;
    }
}
