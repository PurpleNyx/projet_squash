package squash.autom.projet_squash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driverLogin;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driverLogin = driver;
	}
	
	// Initialisation des éléments de la page
	WebElement champUser = driverLogin.findElement(By.xpath("//*[@id=\"username\"]"));
	WebElement champPassword = driverLogin.findElement(By.xpath("//*[@id=\"password\"]"));
	WebElement btConnexion = driverLogin.findElement(By.xpath("//*[@id=\"login-form-button-set\"]/input"));
	
	
	
	
	// Méthode de connexion à l'application
	public void login() {
		champUser.sendKeys("admin");
		champPassword.sendKeys("admin");
		btConnexion.click();		
	}
}

