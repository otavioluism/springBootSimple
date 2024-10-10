package br.com.otavioluism.primeiro_projeto_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // este decorador é um dos principais, denota que o decorador onde se inicia all o processo do spring,
// é obrigatorio ter ele e o metodo main para iniciar a api rest
public class PrimeiroProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringbootApplication.class, args);
	}

}
