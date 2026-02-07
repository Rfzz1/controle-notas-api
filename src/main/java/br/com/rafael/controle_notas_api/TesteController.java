package br.com.rafael.controle_notas_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste")
    public String teste() {
        return "API Controle de Notas está funcionando 🚀";
    }
}
