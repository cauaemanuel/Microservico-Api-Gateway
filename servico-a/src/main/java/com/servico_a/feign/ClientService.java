package com.servico_a.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servico-b")
public interface ClientService {

    @GetMapping("/servico-b")
    public String getServicoB();
}
