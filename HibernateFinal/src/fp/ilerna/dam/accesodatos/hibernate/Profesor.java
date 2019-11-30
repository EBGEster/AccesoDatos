package fp.ilerna.dam.accesodatos.hibernate;

import java.io.Serializable;

import fp.ilerna.dam.accesodatos.Storable;

public class Profesor extends Storable implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String sexo;
	
	public Profesor() {
			
	}
	public Profesor(int id, String nombre, String sexo) {
		this.id = id;
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}
}
