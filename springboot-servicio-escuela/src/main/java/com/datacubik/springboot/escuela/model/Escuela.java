package com.datacubik.springboot.escuela.model;

public class Escuela {
	
	private String nombre;
	private String direccion;
	private String fundador;
	private String fundacion;
	private String mascota;
	
	public Escuela() {
		nombre = "Instituto Politecnico Nacional";
		direccion = "Av. Wilfrido Massieu 308, Nueva Industrial Vallejo, Gustavo A. Madero, 07738 Ciudad de México, CDMX";
		fundador = "Juan de Dios Bátiz Paredes";
		fundacion = "1 de enero de 1936, Ciudad de México";
		mascota = "Burro blanco";
	}
	public Escuela(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFundador() {
		return fundador;
	}
	public void setFundador(String fundador) {
		this.fundador = fundador;
	}
	public String getFundacion() {
		return fundacion;
	}
	public void setFundacion(String fundacion) {
		this.fundacion = fundacion;
	}
	public String getMascota() {
		return mascota;
	}
	public void setMascota(String mascota) {
		this.mascota = mascota;
	}
	
	
}
