package com.app.demo.service;

import com.app.demo.model.TransformRequest;

import java.time.LocalDate;

public class RequestValidator {
    public static void validate(TransformRequest transformRequest) {
        if (transformRequest.getDate().isAfter(LocalDate.now())) {
            throw new ArithmeticException("RequestDate should not be in future");
        }
    }
}
