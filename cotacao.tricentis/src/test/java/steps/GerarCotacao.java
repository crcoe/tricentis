package steps;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import pages.FormInsurantData;
import pages.FormProductData;
import pages.FormSendQuote;
import pages.FormVehicleData;
import runner.Executa;

public class GerarCotacao {
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	FormVehicleData form1 = new FormVehicleData();
	FormInsurantData form2 = new FormInsurantData();
	FormProductData form3 = new FormProductData();
	FormSendQuote form4 = new FormSendQuote();

	@Given("que entre no site da empresa tricentis para cotacao")
	public void queEntreNoSiteDaEmpresaTricentisParaCotacao() throws IOException {
		Executa.abrirNavegador();
		metodos.screenshot("ct01.1-given");
	}

	@Given("que clico na opcao desejada")
	public void queClicoNaOpcaoDesejada() throws IOException {
		metodos.clicar(elementos.btnAutomobile);
		metodos.screenshot("ct01.2-given");
	}

	@When("preencho os dados do veiculo")
	public void preenchoOsDadosDoVeiculo() throws IOException {
		form1.VehicleData("Mercedes Benz", "500", "02/20/2023", "5", "Petrol", "10000", "SAN 1313", "2010",
				"ct01.3-When");
	}

	@When("preencho os dados do seguro")
	public void preenchoOsDadosDoSeguro() throws IOException {
		form2.InsurantData("Carlos", "Coelho", "03/09/1962", "Rua Barcelona, 254", "Brasil", "02250012",
				"São Paulo", "farmer", "https://www.linkedin.com/in/carlos-roberto-coelho-b2218577/", "ct01.4-when ");
	}

	@When("preencho os dados do produto")
	public void preenchoOsDadosDoProduto() throws IOException {

		form3.ProductData("02/27/2024", "15", "Bonus 7", "Full Covarage", "Yes", "ct01.5-when");
	}

	@When("preencho o preco")
	public void preenchoOPreco() throws IOException, InterruptedException {
		metodos.clicar(elementos.platinum);
		metodos.screenshot("ct01.6 - when");
		metodos.carregamento(500);
		metodos.clicar(elementos.nextQuote);
	}

	@When("envio cotacao")
	public void envioCotacao() throws IOException {
		form4.SendQuote("xpto@gmail.com", "11987687690", "carlos", "Teste123", "Teste123", "Executando Testes",
				"ct01.7 - when");

	}

	@Then("cotacao enviada com sucesso")
	public void cotacaoEnviadaComSucesso() throws InterruptedException, IOException {
		metodos.carregamento(15000);
		metodos.validarTexto("Sending e-mail success!", elementos.confirmText);
		metodos.screenshot("ct01.8 - then");
	}

	@After
	public void fecharNavegador() {
		Executa.fecharNavegador();
	}
}
