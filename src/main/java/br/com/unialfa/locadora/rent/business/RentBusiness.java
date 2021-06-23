package br.com.unialfa.locadora.rent.business;


import br.com.unialfa.locadora.rent.domain.Rent;
import br.com.unialfa.locadora.rent.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

public class RentBusiness {
    @Autowired
    private RentRepository rentRepository;

    public Iterable<Rent> listAll(){
        return rentRepository.findAll();
    }
    public boolean validate(Rent rent){
        if(rent.getCliente() == null){
            System.err.println("deve haver um cliente selecionado");
        }else{
            return true;
        }
        return false;
    }

    public void store(Rent rent){
        if(validate(rent)) {
            rentRepository.save(rent);
        }
    }
    public void edit(Rent rent){

        if (validate(rent)){
            rentRepository.save(rent);
        }
    }
    public @ResponseBody
    void destroy(long id){
        rentRepository.deleteById(id);
    }
}
