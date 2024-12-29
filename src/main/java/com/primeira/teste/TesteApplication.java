package com.primeira.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@SpringBootApplication
public class TesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);

	}

	@GetMapping("/teste")
	public String hello(Model model) {
		model.addAttribute("mensagem", "Olá mundo do caralho");
		return "Teste";
	}

	@PostMapping("/teste")
	public String helloPost(@RequestParam("nome") String nome, Model model) {
		model.addAttribute("mensagem", "Olá " + nome + " do caralho");
		return "Teste";
	}

}
