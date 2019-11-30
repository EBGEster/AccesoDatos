package fp.ilerna.dam.accesodatos.hibernate;
import java.io.Serializable;
import java.util.List;

import fp.ilerna.dam.accesodatos.Storable;


public class Alumno extends Storable implements Serializable {

	private static final long serialVersionUID = 1L;	
	private int id;	
	private String nombre;
	private String nacionalidad;
	private int edad;
	private String sexo;
	private List<Modulo> list;
	
	public Alumno() {
		
	}
	
	public Alumno(int id, String nombre, String nacionalidad, int edad, String sexo, List<Modulo> list) {
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.sexo = sexo;
		this.list = list;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Modulo> getList() {
		return list;
	}

	public void setList(List<Modulo> list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad
				+ ", sexo=" + sexo + ", list=" + list + "]";
	}
}
