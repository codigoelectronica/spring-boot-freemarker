package com.example.freemarker.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class LineaFactura implements Serializable {

	private Long id;
	private String descripcion;
	private BigDecimal cantidad;
	private BigDecimal precio;
	private BigDecimal descuento;
	private BigDecimal impuesto;
	private String productoServicio;

	public LineaFactura(Long id, String descripcion, BigDecimal cantidad, BigDecimal precio, 
			BigDecimal descuento, BigDecimal impuesto, String productoServicio) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
		this.descuento = descuento;
		this.impuesto = impuesto;
		this.productoServicio = productoServicio;
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

	public BigDecimal getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	public String getProductoServicio() {
		return productoServicio;
	}

	public void setProductoServicio(String productoServicio) {
		this.productoServicio = productoServicio;
	}

	private static final long serialVersionUID = -673204930199259283L;

}
