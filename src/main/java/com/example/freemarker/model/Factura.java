package com.example.freemarker.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Factura implements Serializable {

	private Empresa empresa;
	private Cliente cliente;
	private Contrato contrato;
	private List<LineaFactura> lineasFactura;
	private Date fechaCreacion;
	private String pieFactura;
	private String numeroFactura;
	private String estadoFactura;
	private List<Pagos> pagos;

	public Factura(Date fechaCreacion, String pieFactura, String numeroFactura, String estadoFactura) {
		super();
		this.fechaCreacion = fechaCreacion;
		this.pieFactura = pieFactura;
		this.numeroFactura = numeroFactura;
		this.estadoFactura = estadoFactura;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public List<LineaFactura> getLineasFactura() {
		return lineasFactura;
	}

	public void setLineasFactura(List<LineaFactura> lineasFactura) {
		this.lineasFactura = lineasFactura;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getPieFactura() {
		return pieFactura;
	}

	public void setPieFactura(String pieFactura) {
		this.pieFactura = pieFactura;
	}

	public String getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public String getEstadoFactura() {
		return estadoFactura;
	}

	public void setEstadoFactura(String estadoFactura) {
		this.estadoFactura = estadoFactura;
	}

	public List<Pagos> getPagos() {
		return pagos;
	}

	public void setPagos(List<Pagos> pagos) {
		this.pagos = pagos;
	}

	private static final long serialVersionUID = -7784956634675107264L;

}
