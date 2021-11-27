package com.app.demo.service;

import com.app.demo.model.SortOrder;

import java.util.List;

public interface NameService {
    List<String> transformOrder(List<String> names, SortOrder order);
}
