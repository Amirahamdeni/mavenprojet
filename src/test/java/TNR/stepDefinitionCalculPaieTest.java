/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TNR;
import com.thoughtworks.selenium.Wait;
import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author ahamdeni
 */
public class stepDefinitionCalculPaieTest {
    
    	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.out.println("*******************");
		System.out.println("launching IEEEEEEEEEEE browser");
		 System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe ");
                	
    driver = new InternetExplorerDriver();
		
	}
        @Test
	public void CalculPaieTest() {
  
		driver.manage().window().maximize();
		driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal");
                driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		

                    WebElement firstNameTextBox = driver.findElement(By.id("loginid"));
                    firstNameTextBox.sendKeys("TYOUSFI");
                   
                    WebElement PasswordTextBox = driver.findElement(By.id("password"));
                    PasswordTextBox.sendKeys("HRA");
                    
                     WebElement Connex = driver.findElement(By.className("hrportal-self-submit-center"));
                     Connex.click();
                     
                     //FIN CONNEXION     
                //NAVIGATION
                    WebElement Menu=  driver.findElement(By.className("hrsp_root_label"));
                    Menu.click();
                    
                   //   Thread.sleep(1000);
                      WebElement Paie = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
                      Paie.click();
                     
                      WebElement SoumCycle = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/div/div"));
                      SoumCycle.click();
                       WebElement CalculPaie= driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/ul/li[1]/div/div[1]"));
                      CalculPaie.click();
                       driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");
                     WebElement Demande= driver.findElement(By.id("PROMPT-1-1"));
                      Demande.sendKeys("%AMIRA%");
                      WebElement Recherche= driver.findElement(By.xpath("//*[@id=\"HRDSEL_1\"]/table/tbody/tr/td/table/tbody/tr[4]/td[6]/input"));
                      Recherche.click();  
                        driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    
                              driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("ViewerFrame");
                     driver.switchTo().frame("body");
                       driver.switchTo().frame("ListView");
                         WebElement PaieToSelect= driver.findElement(By.id("ZO00LISOUM"));
                      PaieToSelect.click();  
                       driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("body");
                    WebElement Travail = driver.findElement(By.id("D*ZO00IDFJOB-0-0_0"));
                    Travail.sendKeys("11");
                     driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("tabs");
                     WebElement tab2 =  driver.findElement(By.id("Tab2off"));
                    tab2.click();
                     driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("body");
                 WebElement Etat = driver.findElement(By.id("D*ZO3PTEACTS-0-0_0"));
                   Etat.click();
                   driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("tabs");
                     WebElement tab3 =  driver.findElement(By.id("Tab3off"));
                    tab3.click();
                      driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("body");
                      WebElement Sql = driver.findElement(By.id("D*ZO5WZOREQU-0-0_0"));
                    Sql.clear();
                    Sql.sendKeys("select nudoss from zy00 where matcle in('M0000009')");
                    driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");
                   WebElement Commit =  driver.findElement(By.id("A*COMMIT_2"));
                 Commit.click();
                 //changement temoin vrs non valide
                 driver.switchTo().defaultContent();
                  WebElement Menu2=  driver.findElement(By.className("hrsp_root_label"));
                    Menu2.click();
                    
                     // Thread.sleep(1000);
                      WebElement Paie2 = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
                      Paie2.click();
                     
                      WebElement VoirRes = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[1]/div"));
                      VoirRes.click();
                     WebElement Bulletin= driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[1]/ul/li[1]/div/div[1]"));
                   Bulletin.click();
                    driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");
                     WebElement Matricule= driver.findElement(By.id("PROMPT-1-1"));
                      Matricule.sendKeys("M0000009");
                       WebElement Recherche2= driver.findElement(By.xpath("//*[@id=\"HRDSEL_1\"]/table/tbody/tr/td/table/tbody/tr[4]/td[14]/input"));
                      Recherche2.click();  
                        driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("body");
                    WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"D*ZX5VVALIDT-0-0_0\"]/option[3]"));
                    dropdown.click();
                       driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");
                   WebElement Commit3 =  driver.findElement(By.id("A*COMMIT_1"));
                 Commit3.click();
                         //retour vers calcul de paie
                                          driver.switchTo().defaultContent();

                          WebElement Menu3=  driver.findElement(By.className("hrsp_root_label"));
                    Menu3.click();
                    
                     // Thread.sleep(1000);
                      WebElement Paie3 = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
                      Paie3.click();
                     
                      WebElement SoumCycle3 = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/div/div"));
                      SoumCycle3.click();
                       WebElement CalculPaie3= driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/ul/li[1]/div/div[1]"));
                      CalculPaie3.click();
                       driver.switchTo().defaultContent();
                        driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                       WebElement ExeDemandeP= driver.findElement(By.id("Z*SubBtn"));
                      ExeDemandeP.click();
                    

                 
}
}