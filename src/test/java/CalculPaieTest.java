

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 *
 * @author ahamdeni
 */
public class CalculPaieTest {
    
    	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		 System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe ");
                 
    driver = new InternetExplorerDriver();
                    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		
	}
        @Test
	public void CalculPaieTest() throws InterruptedException {
  
		driver.manage().window().maximize();
		driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal");
                driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
                 driver.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);


            //    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		

                    WebElement firstNameTextBox = driver.findElement(By.id("loginid"));
                    firstNameTextBox.sendKeys("TYOUSFI");
                   
                    WebElement PasswordTextBox = driver.findElement(By.id("password"));
                    PasswordTextBox.sendKeys("HRA");
                    
                     WebElement Connex = driver.findElement(By.className("hrportal-self-submit-center"));
                     Connex.click();
                     
                     //FIN CONNEXION     
                //NAVIGATION
                Thread.sleep(1000);
                    WebElement Menu=  driver.findElement(By.className("hrsp_root_label"));
                    Menu.click();
                    
                      Thread.sleep(1000);
                      WebElement Paie = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
                      Paie.click();
                                           Thread.sleep(1000);

                      WebElement SoumCycle = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/div/div"));
                      SoumCycle.click();
                     
                       WebElement CalculPaie= driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/ul/li[1]/div/div[1]"));
                      CalculPaie.click();
                      //
                       driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");
                    //
                     WebElement Demande= driver.findElement(By.id("PROMPT-1-1"));
                      Demande.sendKeys("%AMIRA%");
                      //
                      WebElement Recherche= driver.findElement(By.xpath("//*[@id=\"HRDSEL_1\"]/table/tbody/tr/td/table/tbody/tr[4]/td[6]/input"));
                      Recherche.click();
                      //
                        driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    
                              driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("ViewerFrame");
                     driver.switchTo().frame("body");
                       driver.switchTo().frame("ListView");
                       //
                         WebElement PaieChoisie= driver.findElement(By.id("ZO00LISOUM"));
                      PaieChoisie.click();
                      //
                       driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("body");
                    //
                    WebElement Travail = driver.findElement(By.id("D*ZO00IDFJOB-0-0_0"));
                    Travail.sendKeys("11");
                    //
                     driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("tabs");
                  
                     WebElement tab2 =  driver.findElement(By.id("Tab2off"));
                    tab2.click();
                    //
                     driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("body");
              //   WebElement Etat = driver.findElement(By.id("D*ZO3PTEACTS-0-0_0"));
               //    Etat.click();
                   driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("tabs");
                     WebElement tab3 =  driver.findElement(By.id("Tab3off"));
                    tab3.click();
                    //
                      driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("body");
                    //
                      WebElement Sql = driver.findElement(By.id("D*ZO5WZOREQU-0-0_0"));
                    Sql.clear();
                    Sql.sendKeys("select nudoss from zy00 where matcle in('M0000009')");
                    //
                    driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");
                    //
                   WebElement Commit =  driver.findElement(By.id("A*COMMIT_2"));
                 Commit.click();
                 //changement temoin vrs non valide
                 driver.switchTo().defaultContent();
                  WebElement Menu2=  driver.findElement(By.className("hrsp_root_label"));
                    Menu2.click();
                    
                    
                      WebElement Paie2 = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
                      Paie2.click();
                     
                      WebElement VoirRes = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[1]/div"));
                      VoirRes.click();
                     WebElement Bulletin= driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[1]/ul/li[1]/div/div[1]"));
                   Bulletin.click();
                           //
                    Thread.sleep(2000);
                    driver.switchTo().defaultContent().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");
                    //
                     WebElement Matricule= driver.findElement(By.id("PROMPT-1-1"));
                      Matricule.sendKeys("M0000009");
                      //
                       WebElement Recherche2= driver.findElement(By.xpath("//*[@id=\"HRDSEL_1\"]/table/tbody/tr/td/table/tbody/tr[4]/td[14]/input"));
                      Recherche2.click();  
                      //
                        driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("body");
                    //
                    WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"D*ZX5VVALIDT-0-0_0\"]/option[3]"));
                    dropdown.click();
                       driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");
                    //
                   WebElement Commit3 =  driver.findElement(By.id("A*COMMIT_1"));
                 Commit3.click();
                         //retour vers calcul de paie
                         driver.switchTo().defaultContent();

                          WebElement Menu3=  driver.findElement(By.className("hrsp_root_label"));
                    Menu3.click();
                   
                      Thread.sleep(1000);
                      WebElement Paie3 = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
                      Paie3.click();
                     
                      WebElement SoumCycle3 = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/div/div"));
                      SoumCycle3.click();
                       WebElement CalculP= driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/ul/li[1]/div/div[1]"));
                      CalculP.click();
                  try { 
    Alert alert = driver.switchTo().alert();
    alert.accept();
    //if alert present, accept and move on.
}
catch (NoAlertPresentException e) {
  
                  driver.switchTo().defaultContent();
                 driver.navigate().refresh();
                       driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");
                    
                 WebElement DemandeF= driver.findElement(By.id("PROMPT-1-1"));
                      DemandeF.sendKeys("%AMIRA%");
                      WebElement RechercheF= driver.findElement(By.xpath("//*[@id=\"HRDSEL_1\"]/table/tbody/tr/td/table/tbody/tr[4]/td[6]/input"));
                      RechercheF.click();  
                       
                    
                      WebElement ExeDemandeP= driver.findElement(By.xpath("//*[@id=\"Z*SubBtn\"]"));
                     ExeDemandeP.click();
                      Thread.sleep(1000);
                     driver.switchTo().alert().accept();
                      WebElement Resultat= driver.findElement(By.xpath("//*[@id=\"Z*Results\"]"));
                     Resultat.click();
                         Thread.sleep(2000);
                                             driver.switchTo().defaultContent();

                    WebElement frame=driver.findElement(By.xpath("//iframe[@src='https://ppr-hiris.soprahronline.com/hr-rich-client/hrservlet/GetHRPage?TREE=TA0FR&LANG=F&NODE=TA0FR0CT_AB4K3W0X&VOC=FRP&PAGE=ACTION&IDENT=23A82D56-AA6F-465A-9779-FC39D6B47BC3']"));
                        driver.switchTo().frame(frame);
                           Thread.sleep(2000);
                            WebElement Refresh= driver.findElement(By.xpath("//*[@id=\"POPUP_BANNER\"]/table/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"));
                     Refresh.click();

    //do what you normally would if you didn't have the alert.
}

                    

                 
}
}