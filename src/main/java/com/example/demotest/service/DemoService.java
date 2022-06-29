package com.example.demotest.service;

import com.example.demotest.repositories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public String verificarValor(Integer valor) {
        demoRepository.saveValue(valor);

        if (valor % 2 == 0) {
            return "Par";
        }
        return "Ímpar";
    }
}
