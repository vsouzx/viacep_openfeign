package br.com.souza.viacep.client;

import br.com.souza.viacep.dto.ViaCepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "viacep")
public interface ViaCepClient {

    @GetMapping("/{cep}/json")
    ViaCepResponse getCep(@PathVariable("cep") String cep);

}