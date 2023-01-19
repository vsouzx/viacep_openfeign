package br.com.souza.viacep.service;

import br.com.souza.viacep.client.ViaCepClient;
import br.com.souza.viacep.dto.ViaCepResponse;
import org.springframework.stereotype.Service;

@Service
public class ViaCepService {

    private final ViaCepClient client;

    public ViaCepService(ViaCepClient client) {
        this.client = client;
    }

    public ViaCepResponse buscaCep(String cep){
        return client.getCep(cep);
    }
}
