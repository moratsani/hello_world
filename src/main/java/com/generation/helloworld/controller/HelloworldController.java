package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloworldController {
	
	@GetMapping
	public String ola() {
		return "Olá Mundo! Bom dia!";
	}
	
	@GetMapping("comidas")
	public String comidasFavoritas()
	{
		return "sushi \nHamburguer";
	}
	
	@GetMapping("livros")
	public String livrosFavoritos() {
		return "Eragon \nSenhor dos Aneis";
	}
	
	@GetMapping("bsm")
	public String bsmsGeneration() {
		return "Mentalidades \n\n- Orientação ao Futuro\n- Responsabilidade Pessoal\n- Mentalidade de Crescimento"
				+ "\n- Persistência\n\nHabilidades\n\n- Trabalho em Equipe\n- Atenção aos Detalhes\n- Proatividade"
				+ "\n- Comunicação";
	}
	
	@GetMapping("objetivos-aprendizagem")
	public String objetivosAprendizagem() {
		return " Objetivos de Aprendizagem da Semana:\n\n1 - Comunicação\n2 - Atenção aos Detalhes\n3 - Persistência";
	}

}
