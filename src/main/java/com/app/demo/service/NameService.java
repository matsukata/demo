package com.app.demo.service;

import java.util.List;

public interface NameService {

    void create(List<String> names, String order);

    List<String> readAll();

}
