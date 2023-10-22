package dio.padroesDeProjeto.repository;

import dio.padroesDeProjeto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findAllByName(String name);
    Cliente findByName(String name);
    boolean existsClienteById(Long id);
}
