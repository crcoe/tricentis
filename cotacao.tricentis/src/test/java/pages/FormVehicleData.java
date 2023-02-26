package pages;

import java.io.IOException;

import elementos.Elementos;
import metodos.Metodos;

public class FormVehicleData {
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	public void VehicleData(String marca, String enginePerformance, String date, String number, String fuel,
			String price, String license, String mileage, String evidencia) throws IOException {
		metodos.digitar(elementos.make, marca);
		metodos.digitar(elementos.enginePerformance, enginePerformance);
		metodos.digitar(elementos.date, date);
		metodos.digitar(elementos.seats, number);
		metodos.digitar(elementos.fuel, fuel);
		metodos.digitar(elementos.list, price);
		metodos.digitar(elementos.license, license);
		metodos.digitar(elementos.mileage, mileage);
        metodos.screenshot(evidencia);
        metodos.clicar(elementos.nextInsurant);
	}

}
