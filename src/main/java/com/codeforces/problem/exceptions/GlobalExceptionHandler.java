package com.codeforces.problem.exceptions;

import com.codeforces.problem.controllers.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice
class GlobalExceptionHandler extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    private final MessageSource messageSource;

    @Autowired
    public GlobalExceptionHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(MissingParametersException.class)
    public ResponseEntity<Void> handleMissingParametersException(MissingParametersException ex) {
        LOGGER.warn(messageSource.getMessage("exception.missingParameters", null, Locale.getDefault()), ex.getMessage());
        return createSuccessResponse();
    }
}