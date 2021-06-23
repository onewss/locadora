package br.com.unialfa.locadora.marca.repository;


import br.com.unialfa.locadora.marca.domain.Marca;
import org.springframework.data.repository.CrudRepository;

public interface MarcaRepository extends CrudRepository<Marca,Long> {

}