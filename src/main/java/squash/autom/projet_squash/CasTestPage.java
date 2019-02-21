package squash.autom.projet_squash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasTestPage {
	
	// Constructeur 
	private WebDriver driver;
	
	public CasTestPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Initialisation des éléments de la page
	@FindBy(xpath = "//*[@id=\"TestCaseLibrary-15\"]/a")
	private WebElement project;
	
	@FindBy(xpath = "//*[@id=\"tree-create-button\"]/span")
	private WebElement btCreation;
	
	@FindBy(xpath = "//*[@id=\"ui-id-9\"]")
	private WebElement btCreerCT;
	
	@FindBy(xpath = "//*[@id=\"add-test-case-name\"]")
	private WebElement nomCT;
	
	@FindBy(xpath = "//*[@id=\"add-test-case-reference\"]")
	private WebElement refCT;
	
	@FindBy(xpath = "/html/body/div[13]/div[3]/div/input[2]")
	private WebElement btValid;
	
			
	public CasTestDashbordInitPage selectProject() throws InterruptedException {
		project.click();
		Thread.sleep(2000);
		return PageFactory.initElements(driver, CasTestDashbordInitPage.class);
	}
	
	public void createTest() throws InterruptedException {
		project.click();
		Thread.sleep(1000);
		btCreation.click();
		btCreerCT.click();
		Thread.sleep(3000);
		nomCT.sendKeys("Titre du Test");
		refCT.sendKeys("reference");
		btValid.click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
	}
}