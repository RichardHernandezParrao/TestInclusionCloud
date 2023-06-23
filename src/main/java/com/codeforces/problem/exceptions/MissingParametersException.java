package com.codeforces.problem.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MissingParametersException extends RuntimeException {
    private static final Logger LOGGER = LoggerFactory.getLogger(MissingParametersException.class);
    public MissingParametersException() {
        LOGGER.warn("One or more parameters are missing.");
    }
}