package br.com.unialfa.locadora.categoria.business;

import br.com.unialfa.locadora.categoria.domain.Categoria;
import br.com.unialfa.locadora.categoria.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

public class CategoriaBusiness {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Iterable<Categoria> listAll(){
        return categoriaRepository.findAll();
    }
    public boolean validate(Categoria categoria){
        if(categoria.getNome() == ""){
            System.err.println("Nome deve ser preenchido");
        }else{
            return true;
        }
        return false;
    }

    public void store(Categoria categoria){
        if(validate(categoria)) {
            categoriaRepository.save(categoria);
        }
    }
    public void edit(Categoria categoria){
        if (validate(categoria)){
            categoriaRepository.save(categoria);
        }
    }
    public @ResponseBody
    void destroy(long id){
        categoriaRepository.deleteById(id);
    }

}
