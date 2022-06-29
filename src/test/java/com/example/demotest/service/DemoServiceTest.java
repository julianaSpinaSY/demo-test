package com.example.demotest.service;

import com.example.demotest.repositories.DemoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DemoServiceTest {

    @Mock
    private DemoRepository demoRepository;

    @InjectMocks
    private DemoService demoService;

    @Test
    void shouldReturnPar() {
        var response = demoService.verificarValor(4);
        Assertions.assertEquals("Par", response);
    }

    @Test
    void shouldReturnImpar() {
        var response = demoService.verificarValor(5);
        Assertions.assertEquals("Ímpar", response);
    }

}