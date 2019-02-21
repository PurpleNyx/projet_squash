package squash.autom.projet_squash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	// Constructeur 
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initialisation des éléments de la page
	@FindBy(id = "requirement-link")
	private WebElement espaceExigence;
	
	@FindBy(id = "test-case-link")
	private WebElement espaceCasTest;
	
	@FindBy(id = "campaign-link")
	private WebElement espaceCampagne;
	
	
	// Méthode d'initialisation de la page des cas de test
	public CasTestPage goCasdeTest() throws InterruptedException {
		espaceCasTest.click();
		Thread.sleep(2000);
		return PageFactory.initElements(driver, CasTestPage.class);
	}
	
	
}