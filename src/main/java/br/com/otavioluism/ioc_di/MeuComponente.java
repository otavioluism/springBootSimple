package br.com.otavioluism.ioc_di;

import org.springframework.stereotype.Component;

@Component
public class MeuComponente {

    public String meuComponente() {
        return "Retornando o meu componente!";
    }
}
