package com.example.springeurekaclientsideloadbalancing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "app-producer",
      fallback = ClientFallback.class)
public interface Client {

    @GetMapping("/process")
    String getEmployee();

}