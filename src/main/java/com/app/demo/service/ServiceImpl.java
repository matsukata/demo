package com.app.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ServiceImpl implements NameService {
    List<String> nameList = new ArrayList<>();

    @Override
    public void create(List<String> names, String order) {
        nameList.addAll(names);
        Collections.sort(nameList);
        if (order.equals("desc")) {
            Collections.reverse(nameList);
        }
    }

    @Override
    public List<String> readAll() {
        return nameList;
    }
}
