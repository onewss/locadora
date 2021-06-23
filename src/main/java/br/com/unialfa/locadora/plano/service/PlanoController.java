package br.com.unialfa.locadora.plano.service;


import br.com.unialfa.locadora.plano.business.PlanoBusiness;
import br.com.unialfa.locadora.plano.domain.Plano;
import br.com.unialfa.locadora.plano.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/plano")
public class PlanoController {
    @Autowired
    private PlanoRepository planoRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Plano> listAll(){
        return planoRepository.findAll();
    }
    @PostMapping(path = "/add")
    public void store(@RequestBody Plano plano){
        planoRepository.save(plano);
    }
    @PutMapping(path = "edit")
    public void edit(@RequestBody Plano plano){
        planoRepository.save(plano);
    }
    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody void destroy(@PathVariable(name = "id")long id){
        planoRepository.deleteById(id);
    }
}