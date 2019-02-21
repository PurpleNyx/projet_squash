package squash.autom.projet_squash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {	
	
	// Constructeur 
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initialisation des éléments de la page
	@FindBy(id = "username")
	private WebElement champUser;
	
	@FindBy(id = "password")
	private WebElement champPassword;
	
	@FindBy(id = "login-form-button-set")
	private WebElement btConnexion;
	
	
	// Méthode de connexion à l'application
	public HomePage login() throws InterruptedException {
		champUser.sendKeys("admin");
		champPassword.sendKeys("admin");
		btConnexion.click();
		Thread.sleep(2000);
		return PageFactory.initElements(driver, HomePage.class);
	}
}

