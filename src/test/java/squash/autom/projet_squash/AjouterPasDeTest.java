package squash.autom.projet_squash;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjouterPasDeTest {
	
	private WebDriver driver;
	
	@Before
	public void before() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\Desktop\\SUT\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Attention : mettre l'adresse de squash TM
		driver.get("http://192.168.102.93:9876/squash/login");
		Thread.sleep(5000);
	}
	
	@After
	public void after() {
		driver.close();	
		driver.quit();
	}
	
	@Test
	public void AjouterPasdeTest() throws InterruptedException {
		// Pré-requis : créer un cas de test
		
		// Etape de connexion
		System.out.println("Début du test");
		LoginPage loginPage = new LoginPage(driver);
		System.out.println("login");
		loginPage.login();
		HomePage homepage = new HomePage(driver);
		
		// 1 : Sélection cas de test | contrôler surbrillance
		
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