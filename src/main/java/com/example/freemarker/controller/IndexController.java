package com.example.freemarker.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.freemarker.model.Cliente;
import com.example.freemarker.model.Contrato;
import com.example.freemarker.model.Empresa;
import com.example.freemarker.model.Factura;
import com.example.freemarker.model.LineaFactura;
import com.example.freemarker.model.Pagos;

@Controller
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {

		Calendar calendar = Calendar.getInstance();
		Contrato contrato = new Contrato();

		Empresa empresa = new Empresa(2L, "900500600-3", "Empanadas Colombianas", "Juan Martinez", "(57) 312 000 0101",
				"/firma-empresa.jpg", "Bogotá", "Calle 12 # 18 - 4", "(603) 234 0011", "www.empanadas.com");
		contrato.setEmpresa(empresa);

		calendar.set(2023, Calendar.FEBRUARY , 1);
		Cliente cliente = new Cliente(5L, "Alejandro", "Said", "(601) 123 0000", "calle 55 # 36-4",
				"alejandro@test.com", "EMPRESA", "Cliente es nuevo", calendar.getTime(), "/firma-cliente.jpg");
		contrato.setCliente(cliente);

		List<LineaFactura> lineasFactura = new ArrayList<LineaFactura>();

		LineaFactura lc1 = new LineaFactura(1L, "Empanadas de carne", new BigDecimal(12), new BigDecimal(3000),
				new BigDecimal(300), new BigDecimal(500), "PRODUCT");
		LineaFactura lc2 = new LineaFactura(2L, "Empanadas de pollo", new BigDecimal(10), new BigDecimal(3200),
				new BigDecimal(0), new BigDecimal(600), "PRODUCT");
		LineaFactura lc3 = new LineaFactura(3L, "Empanadas mexicana", new BigDecimal(5), new BigDecimal(3300),
				new BigDecimal(0), new BigDecimal(300), "PRODUCT");
		LineaFactura lc4 = new LineaFactura(4L, "Pastel de carne", new BigDecimal(7), new BigDecimal(3500),
				new BigDecimal(500), new BigDecimal(0), "PRODUCT");
		LineaFactura lc5 = new LineaFactura(5L, "Pastel dulce", new BigDecimal(3), new BigDecimal(4000),
				new BigDecimal(0), new BigDecimal(200), "PRODUCT");
		LineaFactura lc6 = new LineaFactura(6L, "Empanadas de champiñon", new BigDecimal(14), new BigDecimal(3800),
				new BigDecimal(0), new BigDecimal(300), "PRODUCT");
		LineaFactura lc7 = new LineaFactura(7L, "Servicio de frito", new BigDecimal(1), new BigDecimal(20000),
				new BigDecimal(0), new BigDecimal(300), "SERVICE");
		LineaFactura lc8 = new LineaFactura(8L, "Servicio de empaque", new BigDecimal(1), new BigDecimal(25000),
				new BigDecimal(0), new BigDecimal(300), "SERVICE");
		LineaFactura lc9 = new LineaFactura(8L, "Servicio de trasnporte", new BigDecimal(1), new BigDecimal(15000),
				new BigDecimal(0), new BigDecimal(300), "SERVICE");

		lineasFactura.add(lc1);
		lineasFactura.add(lc2);
		lineasFactura.add(lc3);
		lineasFactura.add(lc4);
		lineasFactura.add(lc5);
		lineasFactura.add(lc6);
		lineasFactura.add(lc7);
		lineasFactura.add(lc8);
		lineasFactura.add(lc9);
		
		calendar.set(2024, Calendar.JANUARY , 1);
		contrato.setFechaFin(calendar.getTime());
		calendar.set(2024, Calendar.JANUARY , 30);
		contrato.setFechaInicio(calendar.getTime());
		contrato.setNumero("EM-700");
		
		Factura factura = new Factura(new Date(), "La factura debe estar con los totales buen calculados.",
				"FT-2024", "EMITED");
		factura.setLineasFactura(lineasFactura);
		factura.setContrato(contrato);
		factura.setCliente(cliente);
		factura.setEmpresa(empresa);
		
		List<Pagos> pagos = new ArrayList<Pagos>();
		calendar.set(2024, Calendar.JANUARY , 10, 12, 00);
		Pagos p1 = new Pagos(1L, "CASH", calendar.getTime(), new BigDecimal(80000), "SIN-COMPROBANTE", Boolean.TRUE);
		calendar.set(2024, Calendar.JANUARY , 12, 15, 15);
		Pagos p2 = new Pagos(2L, "MASTERCARD", calendar.getTime(), new BigDecimal(30000), "3948394", Boolean.FALSE);
		calendar.set(2024, Calendar.JANUARY , 15, 16, 23);
		Pagos p3 = new Pagos(3L, "VISACARD", calendar.getTime(), new BigDecimal(20000), "7567567", Boolean.TRUE);
		calendar.set(2024, Calendar.JANUARY , 18, 8, 45);
		Pagos p4 = new Pagos(4L, "CHEKC", calendar.getTime(), new BigDecimal(10000), "0001234", Boolean.TRUE);
		
		pagos.add(p1);
		pagos.add(p2);
		pagos.add(p3);
		pagos.add(p4);
		factura.setPagos(pagos);
		
		model.addAttribute("factura", factura);
		return "index";
	}

}
