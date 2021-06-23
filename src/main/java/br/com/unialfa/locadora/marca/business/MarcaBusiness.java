package br.com.unialfa.locadora.marca.business;
import br.com.unialfa.locadora.marca.domain.Marca;
import br.com.unialfa.locadora.marca.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

public class MarcaBusiness {
    @Autowired
    private MarcaRepository marcaRepository;

    public Iterable<Marca> listAll(){
        return marcaRepository.findAll();
    }
    public boolean validate(Marca marca){
        if(marca.getNome() == ""){
            System.err.println("Nome deve ser preenchido");
        }else{
            return true;
        }
        return false;
    }

    public void store(Marca marca){
        if(validate(marca)) {
            marcaRepository.save(marca);
        }
    }
    public void edit(Marca marca){

        if (validate(marca)){
            marcaRepository.save(marca);
        }
    }
    public @ResponseBody
    void destroy(long id){
        marcaRepository.deleteById(id);
    }
}
