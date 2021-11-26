package com.app.demo.controller;

import com.app.demo.model.RestName;
import com.app.demo.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    private final ServiceImpl service;

    @Autowired
    public NameController(ServiceImpl service) {
        this.service = service;
    }

    @PostMapping(value = "/api")
    public ResponseEntity<?> create(@RequestBody RestName restName) {
        List<String> list = restName.getList();
        String order = restName.getOrder();
        service.create(list, order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping(value = "/read")
    public ResponseEntity<List<String>> read() {
        final List<String> names = service.readAll();

        return names != null & !names.isEmpty() ?
                new ResponseEntity<>(names, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
