package pages;

import java.io.IOException;

import elementos.Elementos;
import metodos.Metodos;

public class FormProductData {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	public void ProductData(String start, String insurance, String rating, String damage, String car,
			String evidencia) throws IOException {
		metodos.digitar(elementos.start, start);
		metodos.digitar(elementos.insurance, insurance);
		metodos.digitar(elementos.rating, rating);
		metodos.digitar(elementos.damage, damage);
		metodos.clicar(elementos.products);
		metodos.digitar(elementos.car, car);
		metodos.screenshot(evidencia);
		metodos.clicar(elementos.nextPrice);

	}
}
