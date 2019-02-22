package squash.autom.projet_squash;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CreationCasDeTest {
	
	private WebDriver driver;
	
	@Before
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\Desktop\\SUT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Attention : mettre l'adresse de squash TM
		driver.get("http://192.168.102.93:9876/squash/login");
		Thread.sleep(15000);
	}
	
	@After
	public void after() {
		driver.quit();
	}
	
	//Thread.sleep(3000);
	@Test
	public void AjouterPasdeTest() throws InterruptedException {
		// Pré-requis : créer un cas de test
		
		// Etape de connexion
		System.out.println("Début du test");
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login();
		HomePage homepage =  PageFactory.initElements(driver, HomePage.class);
		homepage.goCasdeTest();
		// 1 : Sélection cas de test | contrôler surbrillance
		CasTestPage testpage = PageFactory.initElements(driver, CasTestPage.class);
		testpage.createTest();
		
		

		
		
	}
	
}