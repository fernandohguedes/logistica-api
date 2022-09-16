package com.algaworks.algalog.api.controllers;

import com.algaworks.algalog.domain.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente cliente1 = new Cliente();
        cliente1.setId(1l);
        cliente1.setNome("João");
        cliente1.setEmail("joao@joao.com");
        cliente1.setTelefone("51-987858541");

        return Arrays.asList(cliente1);
    }
}
