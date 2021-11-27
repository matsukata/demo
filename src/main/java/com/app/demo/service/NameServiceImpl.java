package com.app.demo.service;

import com.app.demo.model.SortOrder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class NameServiceImpl implements NameService {

    @Override
    public List<String> transformOrder(List<String> names, SortOrder order) {
        Collections.sort(names);
        if (order.equals(SortOrder.DESC)) {
            Collections.reverse(names);
        }
        return names;
    }
}

