package com.example.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.freemarker.model.Cliente;

@Controller
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		Cliente cliente = new Cliente();
		cliente.setNombre("oscar");
		cliente.setDireccion("carrera 85");
		cliente.setCorreo("test@test");
		cliente.setTelefono("123456");
		model.addAttribute("cliente", cliente);
		return "index";
	}

}
