package br.com.unialfa.locadora.grupo.service;


import br.com.unialfa.locadora.grupo.business.GrupoBusiness;
import br.com.unialfa.locadora.grupo.domain.Grupo;
import br.com.unialfa.locadora.grupo.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/grupo")
public class GrupoController {
    @Autowired
    private GrupoRepository grupoRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Grupo> listAll(){
        return grupoRepository.findAll();
    }
    @PostMapping(path = "/add")
    public void store(@RequestBody Grupo grupo){
        grupoRepository.save(grupo);
    }
    @PutMapping(path = "edit")
    public void edit(@RequestBody Grupo grupo){
        grupoRepository.save(grupo);
    }
    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody void destroy(@PathVariable(name = "id")long id){
        grupoRepository.deleteById(id);
    }
}
