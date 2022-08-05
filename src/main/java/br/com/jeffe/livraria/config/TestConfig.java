package br.com.jeffe.livraria.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.jeffe.livraria.services.DBServices;

@Configuration
@Profile("test")
public class TestConfig {
	@Autowired
	private DBServices dbServices;

}
