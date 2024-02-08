package com.example.freemarker.model;

import java.io.Serializable;

public class Empresa implements Serializable {

	private Long id;
	private String cif;
	private String nombre;
	private String ciudad;
	private String direccion;
	private String telefono;
	private String urlSitioWeb;
	private String nombreContacto;
	private String telefonoContacto;
	private String firmaContacto;

	public Empresa(Long id, String cif, String nombre, String nombreContacto, String telefonoContacto,
			String firmaContacto, String ciudad, String direccion, String telefono, String urlSitioWeb) {
		super();
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
		this.nombreContacto = nombreContacto;
		this.telefonoContacto = telefonoContacto;
		this.firmaContacto = firmaContacto;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.urlSitioWeb = urlSitioWeb;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUrlSitioWeb() {
		return urlSitioWeb;
	}

	public void setUrlSitioWeb(String urlSitioWeb) {
		this.urlSitioWeb = urlSitioWeb;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getFirmaContacto() {
		return firmaContacto;
	}

	public void setFirmaContacto(String firmaContacto) {
		this.firmaContacto = firmaContacto;
	}

	private static final long serialVersionUID = 60116900349482520L;

}
