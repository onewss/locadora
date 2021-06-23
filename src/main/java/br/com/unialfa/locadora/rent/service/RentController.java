package br.com.unialfa.locadora.rent.service;


import br.com.unialfa.locadora.cliente.domain.Cliente;
import br.com.unialfa.locadora.rent.business.RentBusiness;

import br.com.unialfa.locadora.rent.domain.Rent;
import br.com.unialfa.locadora.rent.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/locacao")
public class RentController {
    @Autowired
    private RentRepository rentRepository;


    @GetMapping(path = "/{idCliente}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Rent> listarPedido(@PathVariable Long idCliente){
        Cliente cliente = new Cliente();
        cliente.setId(idCliente);
        return rentRepository.findByCliente(cliente);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Rent> listAll(){
        return rentRepository.findAll();
    }
    @PostMapping(path = "/add")
    public void store(@RequestBody Rent rent){
        rentRepository.save(rent);
    }
    @PutMapping(path = "edit")
    public void edit(@RequestBody Rent rent){
        rentRepository.save(rent);
    }
    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody void destroy(@PathVariable(name = "id")long id){
        rentRepository.deleteById(id);
    }
}
