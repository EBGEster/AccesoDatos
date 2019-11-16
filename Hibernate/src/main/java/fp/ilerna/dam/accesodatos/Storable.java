package fp.ilerna.dam.accesodatos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class Storable {

	public void storeFile(String filename) throws FileNotFoundException, IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
				
		oos.writeObject(this);
		
		oos.close();
	}
}
