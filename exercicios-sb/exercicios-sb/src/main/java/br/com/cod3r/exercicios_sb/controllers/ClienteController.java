package br.com.cod3r.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exercicios_sb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")//ja configura que pra acessar qualquer metodo nesta controller
								  // tem que colocar o /clientes
public class ClienteController {
	
	//retornando objetos como JSON 
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}

	@GetMapping("/{id}")//buscando cliente por id //PathVariable pode ser usado para pegar as informacoes necessarias que sao passadas pela URL
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00" );
	}
}
