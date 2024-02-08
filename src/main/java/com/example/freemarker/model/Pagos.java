package com.example.freemarker.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Pagos implements Serializable {

	private Long id;
	private String metodoPago;
	private Date fechaPago;
	private BigDecimal valorPago;
	private String numeroComprovate;
	private Boolean pagoAceptado;
	

	public Pagos(Long id, String metodoPago, Date fechaPago, BigDecimal valorPago, String numeroComprovate,
			Boolean pagoAceptado) {
		super();
		this.id = id;
		this.metodoPago = metodoPago;
		this.fechaPago = fechaPago;
		this.valorPago = valorPago;
		this.numeroComprovate = numeroComprovate;
		this.pagoAceptado = pagoAceptado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public BigDecimal getValorPago() {
		return valorPago;
	}

	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}

	public String getNumeroComprovate() {
		return numeroComprovate;
	}

	public void setNumeroComprovate(String numeroComprovate) {
		this.numeroComprovate = numeroComprovate;
	}

	public Boolean getPagoAceptado() {
		return pagoAceptado;
	}

	public void setPagoAceptado(Boolean pagoAceptado) {
		this.pagoAceptado = pagoAceptado;
	}

	private static final long serialVersionUID = -5808989691012876695L;

}
