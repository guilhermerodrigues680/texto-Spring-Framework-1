package com.example.somentespring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SomentespringApplication implements CommandLineRunner {

	@Autowired
	MeuComponente meuComponente;
	@Autowired
	MeuComponente2 meuComponente2;

	private static Logger log = LoggerFactory.getLogger(SomentespringApplication.class);

	public static void main(String[] args) {
		log.info("Aplicação iniciada");
		SpringApplication.run(SomentespringApplication.class, args);
		log.info("Aplicação finalizada");
	}

	@Override
	public void run(String... args) {
		log.info("Argumentos recebidos");

		for (int i = 0; i < args.length; i++) {
			log.info("args[{}] = {}", i, args[i]);
		}

		Pessoa pessoa = meuComponente.getPessoa();
		log.info(pessoa.toString());
		Pessoa pessoa2 = meuComponente2.getPessoa2();
		log.info(pessoa2.toString());
	}

}
