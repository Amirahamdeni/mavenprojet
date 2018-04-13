/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahamdeni
 */
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.SECONDS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class embauche {
        public static WebDriver Driver;

    @Given("^User Is On HomePage$")
public void user_Is_On_HomePage() throws Throwable {
      System.out.println("*******************");
		System.out.println("launching IEEEEEEEEEEE browser");
		
                  Driver = new InternetExplorerDriver();
        System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe ");
        
                Driver.manage().window().maximize();
		Driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal");
                Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String strPageTitle = Driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
   
}

@Then("^User Enters Credentials$")
public void user_Enters_Credentials() throws Throwable {
         WebElement firstNameTextBox = Driver.findElement(By.id("loginid"));
                    firstNameTextBox.sendKeys("TYOUSFI");
                   
                    WebElement PasswordTextBox = Driver.findElement(By.id("password"));
                    PasswordTextBox.sendKeys("HRA");
                    
                     WebElement Connex = Driver.findElement(By.className("hrportal-self-submit-center"));
                     Connex.click();

      
         
 
}

@Then("^User Click On Menu$")
public void user_Click_On_Menu() throws Throwable {
   Driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
         WebElement Menu=  Driver.findElement(By.className("hrsp_root_label"));
                    Menu.click();  
                    Thread.sleep(4000);
    
}

@Then("^User Click On Dossier$")
public void user_Click_On_Dossier() throws Throwable {
     WebElement Dossier = Driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/div/div"));
                      Dossier.click();

}

@Then("^User Click On Entree$")
public void user_Click_On_Entree() throws Throwable {
     WebElement Entree =  Driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[1]/div/div"));
                     Entree.click();
}

@Then("^User Click On Embaucher$")
public void user_Click_On_Embaucher() throws Throwable {
        WebElement Embauche =  Driver.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[1]/ul/li[2]/div/div[1]\n" +""));
                    Embauche.click();
      
}

@Then("^User Switch To BannerFrameone$")
public void user_Switch_To_BannerFrameone() throws Throwable {
   Thread.sleep(30 * 1000);
                    Driver.switchTo().defaultContent();
                    Driver.switchTo().frame("technologyFrame");
                    
                    Driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver.switchTo().frame("AppFrmsFrame");
                    Driver.switchTo().frame("BannerFrame");
}

@Then("^User Click On Creer$")
public void user_Click_On_Creer() throws Throwable {
       WebElement BoutonCreer1 =  Driver.findElement(By.xpath("//*[@id=\"HRDIV1\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
                    BoutonCreer1.click(); 
}

@Then("^User Switch PopUpWindow$")
public void user_Switch_PopUpWindow() throws Throwable {
    Driver.switchTo().defaultContent();
                    System.out.println(Driver.getTitle());

WebElement frame=Driver.findElement(By.xpath("//iframe[@src='https://ppr-hiris.soprahronline.com/hr-rich-client/hrservlet/GetHRPage?TREE=TA0FR&LANG=F&NODE=TA0FR002_AU13100F&VOC=FRP&PAGE=ACTION&IDENT=1FC89A37-FA2D-4F65-B33E-22C021A99320']"));
Driver.switchTo().frame(frame);
}

@Then("^User Type DateRecrutement$")
public void user_Type_DateRecrutement() throws Throwable {
     WebElement DateRecrut =  Driver.findElement(By.id("D*ZY3XDTEFAS_0"));
                 DateRecrut.sendKeys("01/01/2018");
}

@Then("^User Type Societe$")
public void user_Type_Societe() throws Throwable {
   WebElement Societe =  Driver.findElement(By.id("D*ZY3XIDCY00_0"));
                 Societe.sendKeys("CGM");
}

@Then("^User Type Etablissement$")
public void user_Type_Etablissement() throws Throwable {
    WebElement Etabliss =  Driver.findElement(By.id("D*ZY3XIDESTA_0"));
                 Etabliss.sendKeys("CGM01");
                 
}

@Then("^User Click On Alimenter$")
public void user_Click_On_Alimenter() throws Throwable {
   WebElement Alimenter =  Driver.findElement(By.className("POPUPFOOTER_BUTTON"));
                 Alimenter.click();
}

@Then("^User Switch To Body of Renseignements Individuels$")
public void user_Switch_To_Body_of_Renseignements_Individuels() throws Throwable {
     System.out.println(Driver.getTitle());
                
//                Thread.sleep(1000);
                    Driver.switchTo().defaultContent();
                    Driver.switchTo().frame("technologyFrame");
                    
                    Driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver.switchTo().frame("AppFrmsFrame");
                    Driver.switchTo().frame("ViewerFrmsFrame");
                    Driver.switchTo().frame("MainFrame");
                    Driver.switchTo().frame("body");
                    System.out.println(Driver.getTitle());
}



@Then("^User Type Qualite$")
public void user_Type_Qualite() throws Throwable {
    WebElement Qualite =  Driver.findElement(By.id("D*ZY07QUALIT-0-0_0"));
                 Qualite.sendKeys("M.");
}

@Then("^User Type Nom$")
public void user_Type_Nom() throws Throwable {
    WebElement Nom =  Driver.findElement(By.id("D*ZY07NOMUSE-0-0_0"));
                 Nom.sendKeys("BRUNO");
}

@Then("^User Type Prenom$")
public void user_Type_Prenom() throws Throwable {
   WebElement Prenom =  Driver.findElement(By.id("D*ZY06PRENOM-0-0_0"));
                 Prenom.sendKeys("PATRICK");
}

@Then("^User Type Sexe$")
public void user_Type_Sexe() throws Throwable {
  WebElement Sexe =  Driver.findElement(By.id("D*ZY10SEXEMP-0-0_0"));
                 Sexe.sendKeys("MASCULIN");
}

@Then("^User Type DateNaissance$")
public void user_Type_DateNaissance() throws Throwable {
    WebElement DateN =  Driver.findElement(By.id("D*ZY10DATNAI-0-0_0"));
                 DateN.sendKeys("01/01/1990");
}

@Then("^User Switch Tab Affectation$")
public void user_Switch_Tab_Affectation() throws Throwable {
   Driver.switchTo().defaultContent();
                    Driver.switchTo().frame("technologyFrame");
                    
                    Driver.switchTo().frame("OpFrmsFrame");                                        
                    Driver.switchTo().frame("AppFrmsFrame");
                    Driver.switchTo().frame("ViewerFrmsFrame");
                    Driver.switchTo().frame("MainFrame");
                    Driver.switchTo().frame("tabs");
                    System.out.println(Driver.getTitle());
                     WebElement tab2 =  Driver.findElement(By.id("Tab2off"));
                    tab2.click();
}

@Then("^User Switch To Body of Tab Affectation$")
public void user_Switch_To_Body_of_Tab_Affectation() throws Throwable {
     Driver.switchTo().defaultContent();
                    Driver.switchTo().frame("technologyFrame");
                    
                    Driver.switchTo().frame("OpFrmsFrame");                                        
                    Driver.switchTo().frame("AppFrmsFrame");
                    Driver.switchTo().frame("ViewerFrmsFrame");
              Driver.switchTo().frame("MainFrame");
                 Driver.switchTo().frame("body");
}

@Then("^User Type CategoriEntree$")
public void user_Type_CategoriEntree() throws Throwable {
      WebElement CatE =  Driver.findElement(By.id("D*ZYESCGSTHI-0-0_0"));
                 CatE.sendKeys("STANDA");
}

@Then("^User Type MotifEntree$")
public void user_Type_MotifEntree() throws Throwable {
     WebElement MotE =  Driver.findElement(By.id("D*ZYESRSSTHI-0-0_0"));
                 MotE.sendKeys("REX");
}

@Then("^User Type Emploi$")
public void user_Type_Emploi() throws Throwable {
   WebElement Emploi =  Driver.findElement(By.id("D*ZY3BIDJB00-0-0_0"));
                 Emploi.sendKeys("16STAGI");
}

@Then("^User Type UniteOrg$")
public void user_Type_UniteOrg() throws Throwable {
      WebElement UnitO =  Driver.findElement(By.id("D*ZY3BIDOU00-0-0_0"));
                 UnitO.sendKeys("FRCGMARO");
}

@Then("^User Type CalPaie$")
public void user_Type_CalPaie() throws Throwable {
     WebElement CalP =  Driver.findElement(By.id("D*ZY5UIDGPCA-0-0_0"));
                 CalP.sendKeys("01S");
}

@Then("^User Type Code$")
public void user_Type_Code() throws Throwable {
    WebElement Code =  Driver.findElement(By.id("D*ZY5GCODE-0-0_0"));
                 Code.sendKeys("C10A");
}

@Then("^User Switch Tab Carriere$")
public void user_Switch_Tab_Carriere() throws Throwable {
    Driver.switchTo().defaultContent();
                    Driver.switchTo().frame("technologyFrame");
                    
                    Driver.switchTo().frame("OpFrmsFrame");                                        
                    Driver.switchTo().frame("AppFrmsFrame");
                    Driver.switchTo().frame("ViewerFrmsFrame");
                    Driver.switchTo().frame("MainFrame");
                    Driver.switchTo().frame("tabs");
                      System.out.println(Driver.getTitle());
                     WebElement tab3 =  Driver.findElement(By.id("Tab3off"));
                    tab3.click();
}

@Then("^User Switch To Body of Tab Carriere$")
public void user_Switch_To_Body_of_Tab_Carriere() throws Throwable {
    Driver.switchTo().defaultContent();
                    Driver.switchTo().frame("technologyFrame");
                    
                    Driver.switchTo().frame("OpFrmsFrame");                                        
                    Driver.switchTo().frame("AppFrmsFrame");
                    Driver.switchTo().frame("ViewerFrmsFrame");
              Driver.switchTo().frame("MainFrame");
                 Driver.switchTo().frame("body");
}

@Then("^User Type CoCollective$")
public void user_Type_CoCollective() throws Throwable {
     WebElement ConvColl =  Driver.findElement(By.id("D*ZYCACOCONV-0-0_0"));
                ConvColl.sendKeys("9999");

}

@Then("^User Type Qualification$")
public void user_Type_Qualification() throws Throwable {
     WebElement Qual =  Driver.findElement(By.id("D*ZYCAQUALIF-0-0_0"));
                Qual.sendKeys("STA");
}

@Then("^User Type TypePaie$")
public void user_Type_TypePaie() throws Throwable {
    WebElement TypeP =  Driver.findElement(By.id("D*ZYCATYPPAI-0-0_0"));
                TypeP.sendKeys("3");
}

@Then("^User Type CodeGrade$")
public void user_Type_CodeGrade() throws Throwable {
     WebElement CodeG =  Driver.findElement(By.id("D*ZYCAGRCONV-0-0_0"));
                CodeG.sendKeys("9999-STA");
}

@Then("^User Type NatureContrat$")
public void user_Type_NatureContrat() throws Throwable {
    WebElement Nature =  Driver.findElement(By.id("D*ZYCONATCON-0-0_0"));
                Nature.sendKeys("SC");
}

@Then("^User Type TypeContrat$")
public void user_Type_TypeContrat() throws Throwable {
    WebElement TypeContrat =  Driver.findElement(By.id("D*ZYCOTYPCON-0-0_0"));
                TypeContrat.sendKeys("ST");
}

@Then("^User Type TypeTempsContractuel$")
public void user_Type_TypeTempsContractuel() throws Throwable {
    WebElement TypeTc =  Driver.findElement(By.id("D*ZYTLCODTRA-0-0_0"));
                TypeTc.sendKeys("00");
}

@Then("^User Type HeurTrvailSemaine$")
public void user_Type_HeurTrvailSemaine() throws Throwable {
    WebElement Heure =  Driver.findElement(By.id("D*ZYTLNBSTHW-0-0_0"));
                Heure.sendKeys("35");
}

@Then("^User Type PourcentageTempsPlein$")
public void user_Type_PourcentageTempsPlein() throws Throwable {
     WebElement TempsPou =  Driver.findElement(By.id("D*ZYTLRTSTHR-0-0_0"));
                TempsPou.sendKeys("100");
}

@Then("^User Switch Tab SalaireEtPaiement$")
public void user_Switch_Tab_SalaireEtPaiement() throws Throwable {
   Driver.switchTo().defaultContent();
                    Driver.switchTo().frame("technologyFrame");
                    
                    Driver.switchTo().frame("OpFrmsFrame");                                        
                    Driver.switchTo().frame("AppFrmsFrame");
                    Driver.switchTo().frame("ViewerFrmsFrame");
                    Driver.switchTo().frame("MainFrame");
                    Driver.switchTo().frame("tabs");
                      System.out.println(Driver.getTitle());
                     WebElement tab6 =  Driver.findElement(By.id("Tab6off"));
                    tab6.click();
}

@Then("^User Switch To Body of Tab SalaireEtPaiement$")
public void user_Switch_To_Body_of_Tab_SalaireEtPaiement() throws Throwable {
 Driver.switchTo().defaultContent();
                    Driver.switchTo().frame("technologyFrame");

                    Driver.switchTo().frame("OpFrmsFrame");                                        
                    Driver.switchTo().frame("AppFrmsFrame");
                    Driver.switchTo().frame("ViewerFrmsFrame");
              Driver.switchTo().frame("MainFrame");
                 Driver.switchTo().frame("body");
}

@Then("^User Type Rubrique$")
public void user_Type_Rubrique() throws Throwable {
   WebElement Rubrique =  Driver.findElement(By.id("D*ZYAURUBAUG-0-0_0"));
                Rubrique.sendKeys("ISM");
}

@Then("^User Type MontantSalarial$")
public void user_Type_MontantSalarial() throws Throwable {
     WebElement Montant =  Driver.findElement(By.id("D*ZYAUMTSAL-0-0_0"));
                Montant.sendKeys("1500");
}

@Then("^User Type FreqPaie$")
public void user_Type_FreqPaie() throws Throwable {
    WebElement FreqP =  Driver.findElement(By.id("D*ZY13FREQUE-0-0_0"));
                FreqP.sendKeys("MT");
}

@Then("^User Switch To BannerFrametwo$")
public void user_Switch_To_BannerFrametwo() throws Throwable {
  Driver.switchTo().defaultContent();
                    Driver.switchTo().frame("technologyFrame");
                    
                    Driver.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver.switchTo().frame("AppFrmsFrame");
                    Driver.switchTo().frame("BannerFrame");
}

@Then("^User Click On Soumettre$")
public void user_Click_On_Soumettre() throws Throwable {
     WebElement Commit =  Driver.findElement(By.id("A*COMMIT_2"));
                Commit.click();
                               
                    Thread.sleep(1000);
                     Driver.switchTo().defaultContent();
                    WebElement frame2 =Driver.findElement(By.xpath("//iframe[@src='https://ppr-hiris.soprahronline.com/hr-rich-client/errorsDlg.html']"));
                        Driver.switchTo().frame(frame2);
               
               //  WebElement Yesbutton =driver.findElement(By.id("yes_button"));
                  //      Yesbutton.click();
}
    
}
