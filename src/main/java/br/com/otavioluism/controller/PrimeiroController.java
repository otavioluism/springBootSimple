package br.com.otavioluism.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/metodoComQueryBody") // anotation responsável para criar o tipo de http params para tal rota
    public String metodoComQueryBody(@RequestBody Usuario usuario) {
        return "O retorno do query body é = " + usuario.username(); // deve ser o mesmo nome do parametro
    }

    @PostMapping("/metodoComQueryHeader") // anotation responsável para criar o tipo de http params para tal rota
    public String metodoComQueryHeader(@RequestHeader("name") String name) {
        return "O retorno do query header é = " + name;
    }

    @PostMapping("/metodoComQueryHeader2") // anotation responsável para criar o tipo de http params para tal rota
    public String metodoComQueryHeader(@RequestHeader Map<String, String> allHeaders) {
        return "O retorno do query header é = " + allHeaders.entrySet(); // vem no formato de uma lista, caso nao colocar vem no formato objeto
    }

    @GetMapping("/metodoComResponseEntity/{identification}")
    public ResponseEntity<Object> metodoComResponseEntity(@PathVariable("identification") Integer id) {
        var usuario = new Usuario("otavioluism"); // estamos criando um objeto do tipo Usuario com atributo {username: "valor"} por meio da classe record

        if (id > 5) {
            return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Mensagem com problema!");
    }

    record Usuario(String username) {} // record criamos uma classe que não existe getter e setter

}
