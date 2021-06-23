package br.com.unialfa.locadora.categoria.repository;

import br.com.unialfa.locadora.categoria.domain.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria,Long> {

}
