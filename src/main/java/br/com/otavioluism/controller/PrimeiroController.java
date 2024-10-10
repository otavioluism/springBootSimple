package br.com.otavioluism.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // anotation para marcar a classe como uma api rest e sendo um controller
@RequestMapping("/primeiroController") // anotation responsavel por mapear a classe como uma rota
public class PrimeiroController {

    @GetMapping("/metodoComPathParam/{id}") // anotation responsável para criar o tipo de http params para tal rota
    public String metodoComPathParams(@PathVariable String id) {
        return "O retorno do path param é = " + id;
    }

    @GetMapping("/metodoComQueryParam") // anotation responsável para criar o tipo de http params para tal rota
    public String metodoComQueryParams(@RequestParam String id) {
        return "O retorno do query param é = " + id;
    }

    @GetMapping("/metodoComQueryParam2") // anotation responsável para criar o tipo de http params para tal rota
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParam) {
        return "O retorno do query param é = " + allParam;
    }


}
