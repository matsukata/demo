package com.app.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TransformRequest {
    private List<String> elements;
    private String userId;
    private SortOrder sortOrder;
}
