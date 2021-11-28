package com.app.demo.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SortOrder {
    ASC("asc"),
    DESC("desc");
    @JsonValue
    private String order;
}
