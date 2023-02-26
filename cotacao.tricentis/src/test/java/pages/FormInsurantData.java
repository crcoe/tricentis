package pages;

import java.io.IOException;

import elementos.Elementos;
import metodos.Metodos;

public class FormInsurantData {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	
	public void InsurantData(String fName, String lName, String birth, String add, String country, String zip,
			String city, String occupation, String site, String evidencia) throws IOException {

		metodos.digitar(elementos.fName, fName);
		metodos.digitar(elementos.lName, lName);
		metodos.digitar(elementos.birth, birth);
		metodos.clicar(elementos.gender);
		metodos.digitar(elementos.adrres, add);
		metodos.digitar(elementos.contry, country);
		metodos.digitar(elementos.zip, zip);
		metodos.digitar(elementos.city, city);
		metodos.digitar(elementos.occ, occupation);
		metodos.clicar(elementos.hobbie);
		metodos.digitar(elementos.site, site);
		metodos.screenshot(evidencia);
		metodos.clicar(elementos.nextProduct);
	}
}
