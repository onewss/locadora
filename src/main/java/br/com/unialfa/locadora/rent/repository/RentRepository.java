package br.com.unialfa.locadora.rent.repository;

import br.com.unialfa.locadora.cliente.domain.Cliente;
import br.com.unialfa.locadora.rent.domain.Rent;
import org.springframework.data.repository.CrudRepository;

public interface RentRepository extends CrudRepository<Rent,Long> {
    public Iterable<Rent> findByCliente(Cliente cliente);
}
