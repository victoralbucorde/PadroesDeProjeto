package dio.padroesDeProjeto.service;

import dio.padroesDeProjeto.exceptions.ClienteNotFoundException;
import dio.padroesDeProjeto.model.Cliente;
import dio.padroesDeProjeto.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import static java.util.Optional.ofNullable;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getClientesByName(String name) {
        return clienteRepository.findAllByName(name);
    }

    public Cliente getFirstClientByName(String name) {
        return clienteRepository.findByName(name);
    }

    public Cliente getClientById(Long id) {
        return clienteRepository.findById(id).orElseThrow(ClienteNotFoundException::new);
    }

    @Transactional
    public Cliente saveCliente(Cliente cliente) {
        ofNullable(cliente).orElseThrow(() -> new RuntimeException("Cliente não pode ser nulo."));
        if (clienteRepository.existsClienteById(cliente.getId())) {
            throw new RuntimeException("Cliente ja existe.");
        }
        return clienteRepository.save(cliente);
    }


}
