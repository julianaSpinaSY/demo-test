package com.example.demotest.controller;

import com.example.demotest.model.DemoRequest;
import com.example.demotest.service.DemoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
public class DemoControllerTest {
    @InjectMocks
    DemoController controller;

    @Mock
    DemoService service;

    @Test
    @DisplayName("Testa verificação de valor par e ímpar")
    void verificarValor() {
        Mockito.when(service.verificarValor(8)).thenReturn("Par");
        Mockito.when(service.verificarValor(9)).thenReturn("Ímpar");

        var demoRequestPar = new DemoRequest(8);
        var demoRequestImpar = new DemoRequest(9);

        var retornoPar = controller.verificarValor(demoRequestPar);
        var retornoImpar = controller.verificarValor(demoRequestImpar);

        Assertions.assertEquals("Par", retornoPar.getBody());
        Assertions.assertEquals(200, retornoPar.getStatusCodeValue());

        Assertions.assertEquals("Ímpar", retornoImpar.getBody());
        Assertions.assertEquals(200, retornoImpar.getStatusCodeValue());
    }
}
