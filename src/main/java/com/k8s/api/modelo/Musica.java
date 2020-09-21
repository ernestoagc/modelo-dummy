package com.k8s.api.modelo;

public class Musica {

	private long id;
	private String descripcion;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Musica [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
	public Musica(long id, String descripcion) {
		this.id=id;
		this.descripcion=descripcion;
		
	}
	
	
}
