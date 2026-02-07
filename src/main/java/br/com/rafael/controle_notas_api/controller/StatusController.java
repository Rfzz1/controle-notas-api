package br.com.rafael.controle_notas_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/")
    public String status() {
        return "API Controle de Notas online";
    }
    
    @GetMapping("/status")
    public String health() {
        return "OK";
    }
}