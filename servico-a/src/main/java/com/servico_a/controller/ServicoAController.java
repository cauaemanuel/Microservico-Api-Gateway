package com.servico_a.controller;

import com.servico_a.feign.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servico-a")
public class ServicoAController {

    private ClientService clientService;

    public ServicoAController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<String> getServicoA() {
        String responseFromB = clientService.getServicoB();
        return ResponseEntity.ok("Response from Servico A, calling Servico B: " + responseFromB);
    }

}
