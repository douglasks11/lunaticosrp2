package br.lunaticos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class versaoController {

	@RequestMapping(path = "versao")
	public String versao() {
		
		return "versao: 1.0.0";
		
	}
}
