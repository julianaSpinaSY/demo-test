package com.example.demotest.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String verificarValor(Integer valor) {
        if (valor % 2 == 0) {
            return "Par";
        }
        return "Ímpar";
    }
}
