package br.com.unialfa.locadora.categoria.service;


import br.com.unialfa.locadora.categoria.business.CategoriaBusiness;
import br.com.unialfa.locadora.categoria.domain.Categoria;
import br.com.unialfa.locadora.categoria.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Categoria> listar(){
        return categoriaRepository.findAll() ;
    }
    @PostMapping(path = "/add")
    public void store(@RequestBody Categoria categoria){
        categoriaRepository.save(categoria);
    }
    @PutMapping(path = "edit")
    public void edit(@RequestBody Categoria categoria){
        categoriaRepository.save(categoria);
    }
    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody void destroy(@PathVariable(name = "id")long id){
        categoriaRepository.deleteById(id) ;
    }
}
