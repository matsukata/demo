package com.app.demo.controller;

import com.app.demo.model.RestName;
import com.app.demo.service.NameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    private final NameServiceImpl service;

    @Autowired
    public NameController(NameServiceImpl service) {
        this.service = service;
    }

    @PostMapping(value = "/api")
    public ResponseEntity<?> create(@RequestBody RestName restName) {
        List<String> list = restName.getList();
        String order = restName.getOrder();
        List<String> transformedNames = service.create(list, order);
        return new ResponseEntity<>(transformedNames, HttpStatus.CREATED);
    }
}
