package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By btnAutomobile = By.id("nav_automobile");
	public By make = By.id("make");
	public By enginePerformance = By.id("engineperformance");
	public By date = By.id("dateofmanufacture");
	public By seats = By.id("numberofseats");
	public By fuel = By.id("fuel");
	public By list = By.id("listprice");
	public By license = By.id("licenseplatenumber");
	public By mileage = By.id("annualmileage");
	public By nextInsurant = By.id("nextenterinsurantdata");
	public By fName = By.id("firstname");
	public By lName = By.id("lastname");
	public By birth = By.id("birthdate");
	public By gender = By.className("ideal-radiocheck-label");
	public By adrres = By.id("streetaddress");
	public By contry = By.id("country");
	public By zip = By.id("zipcode");
	public By city = By.id("city");
	public By occ = By.id("occupation");
	public By hobbie = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]");
	public By site = By.id("website");
	public By nextProduct = By.id("nextenterproductdata");
	public By start = By.id("startdate");
	public By insurance = By.id("insurancesum");
	public By rating = By.id("meritrating");
	public By damage = By.id("damageinsurance");
	public By products = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	public By car = By.id("courtesycar");
	public By nextPrice = By.id("nextselectpriceoption");
	public By platinum = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]");
	public By nextQuote = By.id("nextsendquote");
	public By email = By.id("email");
	public By phone = By.id("phone");
	public By username = By.id("username");
	public By password = By.id("password");
	public By confpass = By.id("confirmpassword");
	public By comments = By.id("Comments");
	public By send = By.id("sendemail");
	public By confirmText = By.xpath("/html/body/div[4]/h2");

	public By getBtnAutomobile() {
		return btnAutomobile;
	}
}
