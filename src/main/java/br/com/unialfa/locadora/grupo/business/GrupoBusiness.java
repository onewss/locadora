package br.com.unialfa.locadora.grupo.business;


import br.com.unialfa.locadora.grupo.domain.Grupo;
import br.com.unialfa.locadora.grupo.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

public class GrupoBusiness {
    @Autowired
    private GrupoRepository grupoRepository;

    public Iterable<Grupo> listAll(){
        return grupoRepository.findAll();
    }
    public boolean validate(Grupo grupo){
        if(grupo.getNome() == ""){
            System.err.println("Nome deve ser preenchido");
        }else{
            return true;
        }
        return false;
    }

    public void store(Grupo grupo){
        if(validate(grupo)) {
            grupoRepository.save(grupo);
        }
    }
    public void edit(Grupo grupo){

        if (validate(grupo)){
            grupoRepository.save(grupo);
        }
    }
    public @ResponseBody
    void destroy(long id){
        grupoRepository.deleteById(id);
    }
}
