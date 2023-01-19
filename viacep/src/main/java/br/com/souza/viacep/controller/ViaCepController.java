package br.com.souza.viacep.controller;

import br.com.souza.viacep.dto.ViaCepResponse;
import br.com.souza.viacep.service.ViaCepService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/consulta-cep")
public class ViaCepController {

    private final ViaCepService service;

    public ViaCepController(ViaCepService service) {
        this.service = service;
    }

    @GetMapping(value = "/{cep}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ViaCepResponse> findCep(@PathVariable("cep") String cep){
        return new ResponseEntity<>(service.buscaCep(cep), HttpStatus.OK);
    }
}
