package br.com.otavioluism.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/componente")
public class MeuControllerComponente {

    @Autowired // esta notation tem como objetivo gerenciar para nos quando sera intanciado este objeto
    MeuComponente meuComponente;

    @GetMapping("/")
    public String chamandoMeuComponente(){
        return meuComponente.meuComponente();
    }
}
