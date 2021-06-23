package br.com.unialfa.locadora.filial.business;

import br.com.unialfa.locadora.filial.domain.Filial;
import br.com.unialfa.locadora.filial.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

public class FilialBusiness {
    @Autowired
    private FilialRepository filialRepository;

    public Iterable<Filial> listAll(){
        return filialRepository.findAll();
    }
    public boolean validate(Filial filial){
        if(filial.getNome().trim() == "") {
            System.err.println("Nome deve ser preenchido");
        }else if(filial.getCep().trim() == "" || filial.getCep().length() !=8 || !filial.getCep().matches("[0-9]+")  ) {
            System.err.println("CEP incorreto");
        }else if(filial.getUF().trim()=="" || filial.getUF().length()!= 2) {
            System.err.println("UF incorreto");
        }else if(filial.getMunicipio().trim()=="") {
            System.err.println("Município incorreto");
        }else if(filial.getLogradouro().trim() =="") {
            System.err.println("Logradouro incorreto");
        }else if(filial.getNumero().trim() =="" && filial.getComplemento().trim()=="") {
            System.err.println("Informar número ou complemento");
        }else{
            return true;
        }
        return false;
    }

    public void store(Filial filial){
        if(validate(filial)) {
            filialRepository.save(filial);
        }
    }
    public void edit(Filial filial){
        if(validate(filial)) {
            filialRepository.save(filial);
        }
    }
    public @ResponseBody
    void destroy(long id){
        filialRepository.deleteById(id);
    }

}
