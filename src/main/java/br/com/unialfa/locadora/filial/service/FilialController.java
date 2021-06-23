package br.com.unialfa.locadora.filial.service;

import br.com.unialfa.locadora.filial.business.FilialBusiness;
import br.com.unialfa.locadora.filial.domain.Filial;
import br.com.unialfa.locadora.filial.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/filial")
public class FilialController {
    @Autowired
    private FilialRepository filialRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Filial> listAll(){
        return filialRepository.findAll();
    }
    @PostMapping(path = "/add")
    public void store(@RequestBody Filial filial){
        filialRepository.save(filial);
    }
    @PutMapping(path = "edit")
    public void edit(@RequestBody Filial filial){
        filialRepository.save(filial);
    }
    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody void destroy(@PathVariable(name = "id")long id){
        filialRepository.deleteById(id);
    }

}
