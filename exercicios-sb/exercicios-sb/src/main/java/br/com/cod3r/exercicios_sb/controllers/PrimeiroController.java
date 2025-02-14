package br.com.cod3r.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	/*
	 * Anotacoes da aula: Simulando erros
	 * O Spring pode achar a mesma url mas ira dar erro pois pode estar mapeada pelo tipo htpp suportado 
	 * ex, path saudacao esta setado como post, mas se eu der um get no navegador, ira dar erro, pois nao e o metodo suportado
	 **/
	
//	@RequestMapping(method = RequestMethod.GET, path ="/ola" )
	@GetMapping(path =  "/ola")
	public String ola() {
		return "Ola Spring Boot!";
	}

	@PostMapping(path = "/saudacao" )
	public String saudacao() {
		return "Ola Spring Boot! (Post)";
	}

	
}
