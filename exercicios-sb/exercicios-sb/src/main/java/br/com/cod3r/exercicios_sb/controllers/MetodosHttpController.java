package br.com.cod3r.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {
	
	
	@GetMapping
	public String get() {
		return "Requisicao GET";
	}
	
	@PostMapping
	public String post() { //usados em formularios 
		return "Requisicao post";
	}
	
	
	@PutMapping
	public String put() {
		return "Requisicao put";
	}
	
	@PatchMapping
	public String patch() {
		return "Requisicao patch";
	}

	@DeleteMapping
	public String delete() {
		return "Requisicao delete";
	}
}
