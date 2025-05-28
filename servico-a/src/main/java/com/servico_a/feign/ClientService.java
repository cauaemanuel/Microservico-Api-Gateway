package com.servico_a.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servico-b", url = "${servico-b.url}")
public interface ClientService {

    @GetMapping
    public String getServicoB();
}
