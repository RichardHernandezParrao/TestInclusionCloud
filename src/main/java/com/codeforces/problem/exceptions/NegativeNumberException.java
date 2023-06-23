package com.codeforces.problem.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class NegativeNumberException extends RuntimeException {
    private static final Logger LOGGER = LoggerFactory.getLogger(MissingParametersException.class);

    @Value("${spring.properties.value.k}")
    private String k;

    public NegativeNumberException() {
        LOGGER.warn("The value of '"+k+"' cannot be negative.");
    }
}