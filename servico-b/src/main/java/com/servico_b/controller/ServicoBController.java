package com.servico_b.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servico-b")
public class ServicoBController {

    @GetMapping
    public ResponseEntity<String> getServicoB() {
        return ResponseEntity.ok("Response from Servico B");
    }
}
