package com.app.demo.controller;

import com.app.demo.model.SortOrder;
import com.app.demo.model.TransformRequest;
import com.app.demo.service.NameServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class NameController {

    private final NameServiceImpl service;

    @PostMapping(value = "/transform/order")
    public ResponseEntity<?> transformOrder(@RequestBody TransformRequest restName) {
        List<String> list = restName.getElements();
        SortOrder sortOrder = restName.getSortOrder();
        List<String> transformedNames = service.transformOrder(list, sortOrder);
        return new ResponseEntity<>(restName, HttpStatus.CREATED);
    }
}
