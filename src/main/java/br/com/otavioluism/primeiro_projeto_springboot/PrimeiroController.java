package br.com.otavioluism.primeiro_projeto_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // anotation para marcar a classe como uma api rest e sendo um controller
@RequestMapping("/primeiroController") // anotation responsavel por mapear a classe como uma rota
public class PrimeiroController {

    @GetMapping("/primeiroMetodo") // anotation responsável para criar o tipo de http params para tal rota
    public String primeiroMetodo() {
        return "Parabéns, você criou seu primeiro método utilizando SpringBoot!";
    }


}
