package fp.ilerna.dam.accesodatos.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import fp.ilerna.dam.accesodatos.Storable;

@Entity
@Table(name = "PROFESOR")
public class Profesor extends Storable implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NOMBRE_PROFESOR")
	private String nombre;
	
	@Column(name = "SEXO")
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
