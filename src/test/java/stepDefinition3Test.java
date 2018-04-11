

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author ahamdeni
 */
public class stepDefinition3Test {
    
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.out.println("*******************");
		System.out.println("launching IEEEEEEEEEEE browser");
		 System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe ");
                	
    driver = new InternetExplorerDriver();
		
	}

	@Test
	public void EmbaucheTest() throws InterruptedException  {
        
		driver.manage().window().maximize();
		driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal");
                driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
              WebDriverWait wait = new WebDriverWait(driver, 50);

		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
                //CONNEXION
                    WebElement firstNameTextBox = driver.findElement(By.id("loginid"));
                     wait.until(ExpectedConditions.visibilityOf(firstNameTextBox));
                    firstNameTextBox.sendKeys("TYOUSFI");
                   
                    WebElement PasswordTextBox = driver.findElement(By.id("password"));
                    PasswordTextBox.sendKeys("HRA");
                    
                     WebElement Connex = driver.findElement(By.className("hrportal-self-submit-center"));
                     Connex.click();
                //FIN CONNEXION     
                //NAVIGATION
                    WebElement Menu=  driver.findElement(By.className("hrsp_root_label"));
                    Menu.click();
                    
//                      Thread.sleep(1000);
                      WebElement Dossier = driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/div/div"));
                      Dossier.click();
                    

                     WebElement Entree =  driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[1]/div/div"));
                     Entree.click();

                    WebElement Embauche =  driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[1]/ul/li[2]/div/div[1]\n" +""));
                    Embauche.click();
                //FIN NAVIGATION    
                //RENSEIGNEMENT INDIV
//                    Thread.sleep(4000);
                    driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");


                     WebElement BoutonCreer1 =  driver.findElement(By.xpath("//*[@id=\"HRDIV1\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
                    BoutonCreer1.click(); 
                  
                    driver.switchTo().defaultContent();
                    System.out.println(driver.getTitle());
                    Thread.sleep(1000);

                    WebElement frame=driver.findElement(By.xpath("//iframe[@src='https://ppr-hiris.soprahronline.com/hr-rich-client/hrservlet/GetHRPage?TREE=TA0FR&LANG=F&NODE=TA0FR002_AU13100F&VOC=FRP&PAGE=ACTION&IDENT=1FC89A37-FA2D-4F65-B33E-22C021A99320']"));
                        driver.switchTo().frame(frame);
           
                 WebElement DateRecrut =  driver.findElement(By.id("D*ZY3XDTEFAS_0"));
                 DateRecrut.sendKeys("01/01/2018");
                 WebElement Societe =  driver.findElement(By.id("D*ZY3XIDCY00_0"));
                 Societe.sendKeys("CGM");
                
                 WebElement Etabliss =  driver.findElement(By.id("D*ZY3XIDESTA_0"));
                 Etabliss.sendKeys("CGM01");
                 
                  WebElement Alimenter =  driver.findElement(By.className("POPUPFOOTER_BUTTON"));
                 Alimenter.click();
                

            //    driver.switchTo().window(all.get(0));
                System.out.println(driver.getTitle());
                
//                Thread.sleep(1000);
                    driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("body");
                    System.out.println(driver.getTitle());
            //    Thread.sleep(4000);
                WebElement Qualite =  driver.findElement(By.id("D*ZY07QUALIT-0-0_0"));
                 Qualite.sendKeys("M.");
                WebElement Nom =  driver.findElement(By.id("D*ZY07NOMUSE-0-0_0"));
                 Nom.sendKeys("BRUNO");
                    WebElement Prenom =  driver.findElement(By.id("D*ZY06PRENOM-0-0_0"));
                 Prenom.sendKeys("PATRICK");
                 WebElement Sexe =  driver.findElement(By.id("D*ZY10SEXEMP-0-0_0"));
                 Sexe.sendKeys("MASCULIN");
                      WebElement DateN =  driver.findElement(By.id("D*ZY10DATNAI-0-0_0"));
                 DateN.sendKeys("01/01/1990");
//                 Thread.sleep(1000);
                 
                 //CHANGE TAB AFFECTATION
                   driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("tabs");
                    System.out.println(driver.getTitle());
                     WebElement tab2 =  driver.findElement(By.id("Tab2off"));
                    tab2.click();
//                Thread.sleep(1000);
                driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
              driver.switchTo().frame("MainFrame");
                 driver.switchTo().frame("body");
                 
                          //       Thread.sleep(1000);

                 WebElement CatE =  driver.findElement(By.id("D*ZYESCGSTHI-0-0_0"));
                 CatE.sendKeys("STANDA");
                  WebElement MotE =  driver.findElement(By.id("D*ZYESRSSTHI-0-0_0"));
                 MotE.sendKeys("REX");
                  WebElement Emploi =  driver.findElement(By.id("D*ZY3BIDJB00-0-0_0"));
                 Emploi.sendKeys("16STAGI");
                     WebElement UnitO =  driver.findElement(By.id("D*ZY3BIDOU00-0-0_0"));
                 UnitO.sendKeys("FRCGMARO");
                  WebElement CalP =  driver.findElement(By.id("D*ZY5UIDGPCA-0-0_0"));
                 CalP.sendKeys("01S");
                   WebElement Code =  driver.findElement(By.id("D*ZY5GCODE-0-0_0"));
                 Code.sendKeys("C10A");
                 //FIN AFFECTATION
                 //CARRIERE
//                  Thread.sleep(1000);

                   driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("tabs");
                      System.out.println(driver.getTitle());
                     WebElement tab3 =  driver.findElement(By.id("Tab3off"));
                    tab3.click();
                  //  Thread.sleep(1000);
                driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
              driver.switchTo().frame("MainFrame");
                 driver.switchTo().frame("body");
                 WebElement ConvColl =  driver.findElement(By.id("D*ZYCACOCONV-0-0_0"));
                ConvColl.sendKeys("9999");
                 WebElement Qual =  driver.findElement(By.id("D*ZYCAQUALIF-0-0_0"));
                Qual.sendKeys("STA");
                  WebElement TypeP =  driver.findElement(By.id("D*ZYCATYPPAI-0-0_0"));
                TypeP.sendKeys("3");
                 WebElement CodeG =  driver.findElement(By.id("D*ZYCAGRCONV-0-0_0"));
                CodeG.sendKeys("9999-STA");
                
                 WebElement Nature =  driver.findElement(By.id("D*ZYCONATCON-0-0_0"));
                Nature.sendKeys("SC");
                 WebElement TypeContrat =  driver.findElement(By.id("D*ZYCOTYPCON-0-0_0"));
                TypeContrat.sendKeys("ST");
                
                 WebElement TypeTc =  driver.findElement(By.id("D*ZYTLCODTRA-0-0_0"));
                TypeTc.sendKeys("00");
                WebElement Heure =  driver.findElement(By.id("D*ZYTLNBSTHW-0-0_0"));
                Heure.sendKeys("35");
                  WebElement TempsPou =  driver.findElement(By.id("D*ZYTLRTSTHR-0-0_0"));
                TempsPou.sendKeys("100");
                //FINCARRIERE
                //DEBUT SALAIRE ET PAIEMENT
                 driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
                    driver.switchTo().frame("MainFrame");
                    driver.switchTo().frame("tabs");
                      System.out.println(driver.getTitle());
                     WebElement tab6 =  driver.findElement(By.id("Tab6off"));
                    tab6.click();
//                     Thread.sleep(30*1000);
                driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");

                    driver.switchTo().frame("OpFrmsFrame");                                        
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("ViewerFrmsFrame");
              driver.switchTo().frame("MainFrame");
                 driver.switchTo().frame("body");
                   WebElement Rubrique =  driver.findElement(By.id("D*ZYAURUBAUG-0-0_0"));
                Rubrique.sendKeys("ISM");
                 WebElement Montant =  driver.findElement(By.id("D*ZYAUMTSAL-0-0_0"));
                Montant.sendKeys("1500");
                WebElement FreqP =  driver.findElement(By.id("D*ZY13FREQUE-0-0_0"));
                FreqP.sendKeys("MT");
                //FIN DONN2ES
                //NAVIGATION POUR SOUMETTRE
          //      Thread.sleep(1000);
                    driver.switchTo().defaultContent();
                    driver.switchTo().frame("technologyFrame");
                    
                    driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    driver.switchTo().frame("AppFrmsFrame");
                    driver.switchTo().frame("BannerFrame");
                   WebElement Commit =  driver.findElement(By.id("A*COMMIT_2"));
                Commit.click();
                               
                    Thread.sleep(30*1000);
                     driver.switchTo().defaultContent();
                    WebElement frame2 =driver.findElement(By.xpath("//iframe[@src='https://ppr-hiris.soprahronline.com/hr-rich-client/errorsDlg.html']"));
                        driver.switchTo().frame(frame2);
               
                 WebElement Yesbutton =driver.findElement(By.id("yes_button"));
                        Yesbutton.click();

}

	@AfterClass
	public static void tearDown() {
                    System.out.println("*******************");

			//driver.quit();
		
	}
}
