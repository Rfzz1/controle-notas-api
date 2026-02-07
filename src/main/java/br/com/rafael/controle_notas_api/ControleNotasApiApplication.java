package br.com.rafael.controle_notas_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.rafael.controle_notas_api.repository")
@EntityScan(basePackages = "br.com.rafael.controle_notas_api.model")
public class ControleNotasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleNotasApiApplication.class, args);
	}

}
