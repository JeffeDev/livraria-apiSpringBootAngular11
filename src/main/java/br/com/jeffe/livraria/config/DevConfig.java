package br.com.jeffe.livraria.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.jeffe.livraria.services.DBServices;

@Configuration
@Profile("dev")
public class DevConfig {
	@Autowired
	private DBServices dbServices;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;

	@Bean
	public boolean InstanciaBase() {
		
		System.out.println(">>>>" + strategy);
		
		if(strategy.equals("create")) {
			this.dbServices.instanciaBaseDeDados();
		}
		return false;
	}

}
