package pages;

import java.io.IOException;

import elementos.Elementos;
import metodos.Metodos;

public class FormSendQuote {
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	public void SendQuote(String email, String phone, String username, String password, String confpass,
			String comments, String evidencia) throws IOException {

		metodos.digitar(elementos.email, email);
		metodos.digitar(elementos.phone, phone);
		metodos.digitar(elementos.username, username);
		metodos.digitar(elementos.password, password);
		metodos.digitar(elementos.confpass, confpass);
		metodos.digitar(elementos.comments, comments);
		metodos.screenshot(evidencia);
		metodos.clicar(elementos.send);

	}

}
