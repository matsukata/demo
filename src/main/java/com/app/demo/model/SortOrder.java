package com.app.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SortOrder {
    ASC("asc"),
    DESC("desc");
    private String order;
}
