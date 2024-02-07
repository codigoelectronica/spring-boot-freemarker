package com.example.freemarker.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.freemarker.model.Cliente;
import com.example.freemarker.model.Contrato;
import com.example.freemarker.model.Empresa;
import com.example.freemarker.model.LineaContrato;

@Controller
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		Contrato contrato = new Contrato();
		
		Empresa empresa = new Empresa(2L, "900500600-3", "Empanadas Colombianas", "Juan Martinez", "(57) 312 000 0101", "/firma-empresa.jpg");
		contrato.setEmpresa(empresa);
		
		Cliente cliente = new Cliente(5L, "Alejandro", "Said", "(601) 123 0000", "calle 55 # 36-4", "alejandro@test.com", "EMPRESA", 
				"Cliente es nuevo", new Date(), "/firma-cliente.jpg");
		contrato.setCliente(cliente);
		
		
		List<LineaContrato> lineasContrato = new ArrayList<LineaContrato>();
		
		LineaContrato lc1 = new LineaContrato(1L, "Empanadas de carne", new BigDecimal(12), new BigDecimal(3000), new BigDecimal(0));
		LineaContrato lc2 = new LineaContrato(1L, "Empanadas de pollo", new BigDecimal(10), new BigDecimal(3200), new BigDecimal(0));
		LineaContrato lc3 = new LineaContrato(1L, "Empanadas mexicana", new BigDecimal(5), new BigDecimal(3300), new BigDecimal(0));
		LineaContrato lc4 = new LineaContrato(1L, "Pastel de carne", new BigDecimal(7), new BigDecimal(3500), new BigDecimal(0));
		LineaContrato lc5 = new LineaContrato(1L, "Pastel dulce", new BigDecimal(3), new BigDecimal(4000), new BigDecimal(0));
		LineaContrato lc6 = new LineaContrato(1L, "Empanadas de champiñon", new BigDecimal(14), new BigDecimal(3800), new BigDecimal(0));
		
		lineasContrato.add(lc1);
		lineasContrato.add(lc2);
		lineasContrato.add(lc3);
		lineasContrato.add(lc4);
		lineasContrato.add(lc5);
		lineasContrato.add(lc6);
		
		model.addAttribute("contrato", contrato);
		return "index";
	}

}
