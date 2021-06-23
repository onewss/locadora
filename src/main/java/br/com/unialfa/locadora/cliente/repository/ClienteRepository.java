package br.com.unialfa.locadora.cliente.repository;

import br.com.unialfa.locadora.cliente.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
