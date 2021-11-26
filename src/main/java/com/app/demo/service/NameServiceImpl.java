package com.app.demo.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class NameServiceImpl implements NameService {

    @Override
    public List<String> create(List<String> names, String order) {
        Collections.sort(names);
        if (order.equals("desc")) {
            Collections.reverse(names);
        }
        return names;
    }
}

