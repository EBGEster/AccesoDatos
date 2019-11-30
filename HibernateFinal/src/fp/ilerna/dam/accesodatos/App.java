package fp.ilerna.dam.accesodatos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import fp.ilerna.dam.accesodatos.hibernate.Alumno;
import fp.ilerna.dam.accesodatos.hibernate.Modulo;
import fp.ilerna.dam.accesodatos.hibernate.Profesor;

public class App {

	public static void main(String[] args) {
		
		Modulo m = new Modulo(1,"Acceso a Datos", "M06");
		Profesor p = new Profesor(1,"Rafael", "Masculino");
		List<Modulo> li = new LinkedList<Modulo>();
		li.add(m);
		Alumno a = new Alumno(1,"Ester","Española",22,"Femenino",li);
		
		try {
			m.storeFile("Modulo.obj");
			p.storeFile("Profesor.obj");
			a.storeFile("Alumno.obj");
			System.out.println("Objetos generados");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
