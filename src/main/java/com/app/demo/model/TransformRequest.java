package com.app.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Validated
@Getter
@Setter
public class TransformRequest {
    private List<String> elements;
@NotNull
@NotBlank
@Size(max=100, message = "UserId field length must be in range from 1 to 100 symbols")
    private String userId;
    private SortOrder sortOrder;
    private LocalDate date;
}
