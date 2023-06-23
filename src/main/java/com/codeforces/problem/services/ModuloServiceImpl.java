package com.codeforces.problem.services;

import com.codeforces.problem.exceptions.MissingParametersException;
import com.codeforces.problem.exceptions.NegativeNumberException;
import com.codeforces.problem.models.ModuloResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class ModuloServiceImpl implements ModuloService {
    private final ModuloResponseDTO responseDTO;

    public ModuloServiceImpl(ModuloResponseDTO responseDTO) {
        this.responseDTO = responseDTO;
    }

    @Override
    public ModuloResponseDTO findMax(Integer x, Integer y, Integer n) {
        validateParameters(x, y, n);

        int max = n - (n - y) % x;

        responseDTO.setMax(max);
        return responseDTO;
    }

    public void validateParameters(Integer x, Integer y, Integer n) {
        if (x == null || y == null || n == null) {
            throw new MissingParametersException();
        }else if (n < 0){
            throw new NegativeNumberException();
        }
    }
}