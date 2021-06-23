package br.com.unialfa.locadora.plano.business;

import br.com.unialfa.locadora.plano.domain.Plano;
import br.com.unialfa.locadora.plano.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

public class PlanoBusiness {
    @Autowired
    private PlanoRepository planoRepository;

    public Iterable<Plano> listAll(){
        return planoRepository.findAll();
    }
    public boolean validate(Plano plano){
        if(plano.getNome() == "") {
            System.err.println("Nome deve ser preenchido");
        }else{
            return true;
        }
        return false;
    }

    public void store(Plano plano){
        if(validate(plano)) {
            planoRepository.save(plano);
        }
    }
    public void edit(Plano plano){

        if (validate(plano)){
            planoRepository.save(plano);
        }
    }
    public @ResponseBody
    void destroy(long id){
        planoRepository.deleteById(id);
    }
}
