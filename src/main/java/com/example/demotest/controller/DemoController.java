package com.example.demotest.controller;

import com.example.demotest.model.DemoRequest;
import com.example.demotest.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {
    private final DemoService demoService;

    @PostMapping
    public ResponseEntity<String> verificarValor(@RequestBody DemoRequest request) {
        return ResponseEntity.ok(this.demoService.verificarValor(request.getValor()));
    }
}
