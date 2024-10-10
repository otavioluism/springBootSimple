package br.com.otavioluism.primeiro_projeto_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // este decorador é um dos principais, denota que o decorador onde se inicia all o processo do spring,
// é obrigatorio ter ele e o metodo main para iniciar a api rest
@ComponentScan(basePackages = "br.com.otavioluism") // esta anotation tem objetivo de classe principal mapear tudo que estiver no
// pacote inserido, pois como movemos a pasta controller para fora da pasta do projeto foi preciso mapear para spring entender que existe outros arquivos para verificar
public class PrimeiroProjetoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringbootApplication.class, args);
	}

}
