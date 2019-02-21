package squash.autom.projet_squash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasTestDashbordInitPage {
	
	// Constructeur 
	private WebDriver driver;
	
	public CasTestDashbordInitPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(xpath = "//*[@id=\"dashboard-master\"]/div/div[1]/div/input[1]")
	private WebElement btRefrech;
	
	@FindBy(xpath = "//*[@id=\"dashboard-bound-reqs-view\"]/canvas[7]")
	private WebElement casTestOrph;
	
	
	public CasTestDashbordPage initDashbord() throws InterruptedException {
		btRefrech.click();
		Thread.sleep(2000);
		return PageFactory.initElements(driver, CasTestDashbordPage.class);
		
	}
}