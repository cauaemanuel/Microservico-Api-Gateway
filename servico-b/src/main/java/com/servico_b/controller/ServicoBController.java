package com.servico_b.controller;

@RestController
@RequestMapping("/servico-b")
public class ServicoBController {

    @GetMapping()
    public ResponseEntity<String> getServicoB() {
        return new ResponseEntity.ok("Response from Servico B");
    }
}
