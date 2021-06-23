package br.com.unialfa.locadora.marca.service;


import br.com.unialfa.locadora.marca.business.MarcaBusiness;
import br.com.unialfa.locadora.marca.domain.Marca;
import br.com.unialfa.locadora.marca.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/marca")
public class MarcaController {
    @Autowired
    private MarcaRepository marcaRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Marca> listAll(){
        return marcaRepository.findAll();
    }
    @PostMapping(path = "/add")
    public void store(@RequestBody Marca marca){
        marcaRepository.save(marca);
    }
    @PutMapping(path = "edit")
    public void edit(@RequestBody Marca marca){
        marcaRepository.save(marca);
    }
    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody void destroy(@PathVariable(name = "id")long id){
        marcaRepository.deleteById(id);
    }
}
