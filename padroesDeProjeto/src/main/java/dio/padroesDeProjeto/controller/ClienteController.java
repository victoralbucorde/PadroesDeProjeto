package dio.padroesDeProjeto.controller;

import dio.padroesDeProjeto.model.Cliente;
import dio.padroesDeProjeto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable Long id) {
        return clienteService.getClientById(id);
    }
}
