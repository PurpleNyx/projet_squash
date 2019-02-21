package squash.autom.projet_squash;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import squash.autom.projet_squash.HomePage;


public class AjouterPasDeTest {
	
	private WebDriver driver;
	
	@Before
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\Desktop\\SUT\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Attention : mettre l'adresse de squash TM
		driver.get("http://192.168.102.93:9876/squash/login");
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
		testpage.selectProject();
		CasTestDashbordInitPage dashbordinit = PageFactory.initElements(driver, CasTestDashbordInitPage.class);
		dashbordinit.initDashbord();
		CasTestDashbordPage dashbord = PageFactory.initElements(driver, CasTestDashbordPage.class);
		dashbord.goCasTest();
		ListeCasTestPage listCT = PageFactory.initElements(driver, ListeCasTestPage.class);
		listCT.openTreeCT();
		Thread.sleep(3000);
		
		// 2 : Ajouter un pas de test | Action/Résultat attendu / bt Ajouter un autre Ajouter / Fermer
		
		// 3 : Cliquer sur fermer 
		
		// 4 : Répéter étape 1 & 2
		
		// 5 : Compléter Action : Ajouter un pas de test
		//	 : Compléter Résultat attentdu : le pas de test est ajouté
		//	 : Cliquer sur ajouter
		//	 : Contrôler ajout
		
		// 6 : Cliquer sur le texte de la colonne Action
		
		// 7 : Cliquer sur le bouton Annuler
		
		// 8 : Répéter étape 6
		
		// 9 : Modifier le texte existant, insérer un lien via le bouton lien
		
		// 10 : Confirmer champa action + vérifier lien actif
		
		// 11 : Revenir sur Pas de test
		
		// 12 : Ajouter pas de test vide + contrôle
		
		// 13 : Dans pas de test, cliquer sur "cliquer pour éditer" de résultat attendu + verif
		
		// 14 : Annuler
		
		// 15 : Etape 13 + Agrandir
		
		// 16 : Insérer un texte + Confirmer
		
	}
	
	
}