package com.example.sessionsScopeMaven.controller;

import com.example.sessionsScopeMaven.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

//    @GetMapping("/france")
//    public Country france(){
//        Country c = Country.of("France",2);
//        return c;
//    }
    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        var country = Country.of("France",2);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .header("Continent","Europe")
                .header("capital","Paris")
                .body(country);
    }

    @GetMapping("/all")
    public List<Country> allCountry(){
        var france = Country.of("France",2);
        var Russia = Country.of("GREAT RUSSIA",200000000);
        return List.of(france,Russia);
    }

}
