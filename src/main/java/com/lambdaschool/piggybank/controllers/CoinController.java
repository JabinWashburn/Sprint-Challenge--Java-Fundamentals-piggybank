package com.lambdaschool.piggybank.controllers;

import com.lambdaschool.piggybank.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoinController {

    @Autowired
    CoinRepository coinrepos;

    //http://localhost:2019/total

    @GetMapping(value = "/total", produces = "application/json")
    public ResponseEntity<?>
}
