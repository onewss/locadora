package br.com.unialfa.locadora;

import br.com.unialfa.locadora.cliente.domain.Cliente;
import br.com.unialfa.locadora.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LocadoraApplication {

	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {

		SpringApplication.run(LocadoraApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase() {
		Cliente cliente = new Cliente();
		cliente.setNome("ClienteTeste");
		cliente.setCpf("111.111.111-11");
		cliente.setDataNascimento(LocalDate.now());
		cliente.setVersao(1);
		cliente.setPrimeiroNome("Teste");
		clienteRepository.save(cliente);

		return null;
	}

}
