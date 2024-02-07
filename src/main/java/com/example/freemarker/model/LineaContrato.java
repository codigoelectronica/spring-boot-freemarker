package com.example.freemarker.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class LineaContrato implements Serializable {

	private Long id;
	private String descripcion;
	private BigDecimal cantidad;
	private BigDecimal precio;
	private BigDecimal descuento;

	public LineaContrato(Long id, String descripcion, BigDecimal cantidad, BigDecimal precio, BigDecimal descuento) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
		this.descuento = descuento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	private static final long serialVersionUID = -673204930199259283L;

}
