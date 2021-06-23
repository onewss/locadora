package br.com.unialfa.locadora.veiculo.service;


import br.com.unialfa.locadora.veiculo.business.VeiculoBusiness;
import br.com.unialfa.locadora.veiculo.domain.Veiculo;
import br.com.unialfa.locadora.veiculo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/veiculo")
public class VeiculoController {
    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Veiculo> listAll(){
        return veiculoRepository.findAll();
    }
    @PostMapping(path = "/add")
    public void store(@RequestBody Veiculo veiculo){
        veiculoRepository.save(veiculo);
    }
    @PutMapping(path = "edit")
    public void edit(@RequestBody Veiculo veiculo){
        veiculoRepository.save(veiculo);
    }
    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody void destroy(@PathVariable(name = "id")long id){
        veiculoRepository.deleteById(id);
    }
}
