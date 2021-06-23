package br.com.unialfa.locadora.modelo.business;
import br.com.unialfa.locadora.modelo.domain.Modelo;
import br.com.unialfa.locadora.modelo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

public class ModeloBusiness {
    @Autowired
    private ModeloRepository modeloRepository;

    public Iterable<Modelo> listAll(){
        return modeloRepository.findAll();
    }
    public boolean validate(Modelo modelo){
        if(modelo.getNome() == ""){
            System.err.println("Nome deve ser preenchido");
        }else{
            return true;
        }
        return false;
    }

    public void store(Modelo modelo){
        if(validate(modelo)) {
            modeloRepository.save(modelo);
        }
    }
    public void edit(Modelo modelo){

        if (validate(modelo)){
            modeloRepository.save(modelo);
        }
    }
    public @ResponseBody
    void destroy(long id){
        modeloRepository.deleteById(id);
    }
}
