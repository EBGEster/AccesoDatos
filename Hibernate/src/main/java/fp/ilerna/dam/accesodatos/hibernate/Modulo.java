package fp.ilerna.dam.accesodatos.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import fp.ilerna.dam.accesodatos.Storable;

@Entity
@Table(name = "MODULO")
public class Modulo extends Storable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NOMBRE_MODULO")
	private String name;
	
	@Column(name = "COD_MODULO")
	private String codigo;
	
	public Modulo() {
			
		}
	
	public Modulo(int id, String name, String codigo) {
		this.id = id;
		this.name = name;
		this.codigo = codigo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Modulo [id=" + id + ", name=" + name + ", codigo=" + codigo + "]";
	}
		
}
