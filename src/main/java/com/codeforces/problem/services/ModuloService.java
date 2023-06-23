package com.codeforces.problem.services;

import com.codeforces.problem.models.ModuloResponseDTO;

public interface ModuloService {
    void validateParameters(Integer x, Integer y, Integer n);
    ModuloResponseDTO findMax(Integer x, Integer y, Integer n);
}