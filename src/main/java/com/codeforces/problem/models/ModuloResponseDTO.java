package com.codeforces.problem.models;

import org.springframework.stereotype.Component;

@Component
public class ModuloResponseDTO {
    private int max;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}