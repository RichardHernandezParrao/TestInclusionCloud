package com.codeforces.problem.controllers;

import com.codeforces.problem.services.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/modulo")
public class ModuloController extends BaseController {
    private final ModuloService moduloService;

    @Autowired
    public ModuloController(ModuloService moduloService) {
        this.moduloService = moduloService;
    }

    @GetMapping("/findMax")
    public ResponseEntity<Object> findMax(
            @RequestParam(required = false) Integer x,
            @RequestParam(required = false) Integer y,
            @RequestParam(required = false) Integer n
    ) {
        return createSuccessResponse(moduloService.findMax(x, y, n).getMax());
    }

    @PostMapping("/findMax")
    public ResponseEntity<Object> findMaxPost(
            @RequestParam(required = false) Integer x,
            @RequestParam(required = false) Integer y,
            @RequestParam(required = false) Integer n
    ) {
        return createSuccessResponse(moduloService.findMax(x, y, n).getMax());
    }
}