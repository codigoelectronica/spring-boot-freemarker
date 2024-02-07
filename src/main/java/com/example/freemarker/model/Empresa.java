package com.example.freemarker.model;

import java.io.Serializable;

public class Empresa implements Serializable {

	private Long id;
	private String cif;
	private String nombre;
	private String nombreContacto;
	private String telefonoContacto;
	private String firmaContacto;

	public Empresa(Long id, String cif, String nombre, String nombreContacto, String telefonoContacto,
			String firmaContacto) {
		super();
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
		this.nombreContacto = nombreContacto;
		this.telefonoContacto = telefonoContacto;
		this.firmaContacto = firmaContacto;
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
