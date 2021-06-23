package br.com.unialfa.locadora.veiculo.repository;

import br.com.unialfa.locadora.veiculo.domain.Veiculo;
import org.springframework.data.repository.CrudRepository;

public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {
}
