package br.com.unialfa.locadora.modelo.service;


import br.com.unialfa.locadora.modelo.business.ModeloBusiness;
import br.com.unialfa.locadora.modelo.domain.Modelo;
import br.com.unialfa.locadora.modelo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/modelo")
public class ModeloController {
    @Autowired
    private ModeloRepository modeloRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Modelo> listAll(){
        return modeloRepository.findAll();
    }
    @PostMapping(path = "/add")
    public void store(@RequestBody Modelo modelo){
        modeloRepository.save(modelo);
    }
    @PutMapping(path = "edit")
    public void edit(@RequestBody Modelo modelo){
        modeloRepository.save(modelo);
    }
    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody void destroy(@PathVariable(name = "id")long id){
        modeloRepository.deleteById(id);
    }
}
