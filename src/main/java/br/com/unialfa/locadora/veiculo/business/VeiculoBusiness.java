package br.com.unialfa.locadora.veiculo.business;

import br.com.unialfa.locadora.veiculo.domain.Veiculo;
import br.com.unialfa.locadora.veiculo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.InputMismatchException;
import java.util.Optional;

@Service
public class VeiculoBusiness {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Iterable<Veiculo> listAll()
    {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> findById(long id)
    {
        return veiculoRepository.findById(id);
    }

    public void store( Veiculo veiculo ) {
            veiculoRepository.save(veiculo);
    }

    public void edit( Veiculo veiculo ){

        veiculoRepository.save(veiculo);
    }

    public @ResponseBody
    void destroy( long id){
        veiculoRepository.deleteById(id);
    }


}
