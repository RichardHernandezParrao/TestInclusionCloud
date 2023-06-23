package com.codeforces.problem.models;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ModuloRequestDTO {
    private Integer x;
    private Integer y;
    private Integer n;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }
}