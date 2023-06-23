package com.codeforces.problem.controllers;

import org.springframework.http.ResponseEntity;

public abstract class BaseController {
    protected ResponseEntity<Object> createSuccessResponse(Object data) {
        return ResponseEntity.ok(data);
    }
    protected ResponseEntity<Void> createSuccessResponse() {
        return ResponseEntity.ok().build();
    }
}