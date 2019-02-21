package squash.autom.projet_squash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListeCasTestPage {
	
	// Constructeur 
	private WebDriver driver;
	
	public ListeCasTestPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath = "//*[@id=\"test-case-search-result-table\"]/tbody/tr[1]/td[17]/span")
	private WebElement btOpenInTree;
	
	
	
	public void openTreeCT() {
		btOpenInTree.click();
	}
	
}