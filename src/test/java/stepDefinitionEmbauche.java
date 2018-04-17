



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
import cucumber.api.java.en.When;

import cucumber.api.java.en.Then;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class stepDefinitionEmbauche {
    	
    public  WebDriver Driver1;
    
    	
  
    @Given("^User Is On HomePage$")
    public void user_Is_On_HomePage() throws Throwable {
       
		     System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe ");
                  Driver1 = new InternetExplorerDriver();
                Driver1.manage().window().maximize();
             String URL = System.getProperty("ENVIRONNEMENTCLIENT");

                
		Driver1.navigate().to(URL);
              Driver1.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
                 Driver1.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		String strPageTitle = Driver1.getTitle();
		System.out.println("Page title: - "+strPageTitle);
    }
    
    

    @When("^User Enters Name And Password$")
    public void user_Enters_Name_And_Password() throws Throwable {
       
    
         
         WebElement firstNameTextBox = Driver1.findElement(By.id("loginid"));
                    firstNameTextBox.sendKeys("TYOUSFI");
                   
                    WebElement PasswordTextBox = Driver1.findElement(By.id("password"));
                    PasswordTextBox.sendKeys("HRA");
                    
                     WebElement Connex = Driver1.findElement(By.className("hrportal-self-submit-center"));
                     Connex.click();   
         
    }
    


    
    
    @Then("^User Click On Menu$")
    public void user_click_on_menu_() throws Throwable {
      
         WebElement Menu=  Driver1.findElement(By.className("hrsp_root_label"));
                    Menu.click();  
                    Thread.sleep(1000);
    }

    @Then("^User Click On Dossier$")
    public void user_click_on_dossier_() throws Throwable {
        WebElement Dossier = Driver1.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/div/div"));
                      Dossier.click();
                    
    }

    @Then("^User Click On Entree$")
    public void user_click_on_entree_() throws Throwable {
        WebElement Entree =  Driver1.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[1]/div/div"));
                     Entree.click();
    }

    @Then("^User Click On Embaucher$")
    public void user_click_on_embaucher_() throws Throwable {
          WebElement Embauche =  Driver1.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[1]/ul/li[1]/ul/li[2]/div/div[1]\n" +""));
                    Embauche.click();
      
    }

    @Then("^User Switch To BannerFrameone$")
    public void user_Switch_To_BannerFrameone() throws Throwable {
      Thread.sleep(2000);
                    Driver1.switchTo().defaultContent();
                    Driver1.switchTo().frame("technologyFrame");
                    
                    Driver1.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver1.switchTo().frame("AppFrmsFrame");
                    Driver1.switchTo().frame("BannerFrame");
    }

    @Then("^User Click On Creer$")
    public void user_click_on_creer_() throws Throwable {
                                        

       WebElement BoutonCreer1 =  Driver1.findElement(By.xpath("//*[@id=\"HRDIV1\"]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input"));
                    BoutonCreer1.click(); 
    }

    @Then("^User Switch PopUpWindow$")
    public void user_switch_popupwindow() throws Throwable {
        
        Driver1.switchTo().defaultContent();
                    System.out.println(Driver1.getTitle());
                                 Thread.sleep(1000);

WebElement frame=Driver1.findElement(By.xpath("//iframe[@src='https://ppr-hiris.soprahronline.com/hr-rich-client/hrservlet/GetHRPage?TREE=TA0FR&LANG=F&NODE=TA0FR002_AU13100F&VOC=FRP&PAGE=ACTION&IDENT=1FC89A37-FA2D-4F65-B33E-22C021A99320']"));
Driver1.switchTo().frame(frame);
           
               
                
    }

    @Then("^User Type DateRecrutement '(.+)'$")
    public void user_type_daterecrutement_(String daterecrutement) throws Throwable {
          WebElement DateRecrut =  Driver1.findElement(By.id("D*ZY3XDTEFAS_0"));
                 DateRecrut.sendKeys(daterecrutement);
    }

    @Then("^User Type Societe '(.+)'$")
    public void user_type_societe_(String societe) throws Throwable {
        WebElement Societe =  Driver1.findElement(By.id("D*ZY3XIDCY00_0"));
                 Societe.sendKeys(societe);
    }

    @Then("^User Type Etablissement '(.+)'$")
    public void user_type_etablissement_(String etablissement) throws Throwable {
          Thread.sleep(1000);
    WebElement Etabliss =  Driver1.findElement(By.id("D*ZY3XIDESTA_0"));
                 Etabliss.sendKeys(etablissement);
    }

    @Then("^User Click On Alimenter$")
    public void user_click_on_alimenter_() throws Throwable {
         WebElement Alimenter =  Driver1.findElement(By.className("POPUPFOOTER_BUTTON"));
                 Alimenter.click();
    }

    @Then("^User Switch To Body of Renseignements Individuels$")
    public void user_switch_to_body_of_renseignements_individuels() throws Throwable {
                          ArrayList<String> allWindows = new ArrayList<> (Driver1.getWindowHandles());

         Driver1.switchTo().window(allWindows.get(0));
                System.out.println(Driver1.getTitle());
                
                Thread.sleep(1000);
                    Driver1.switchTo().defaultContent();
                    Driver1.switchTo().frame("technologyFrame");
                    
                    Driver1.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver1.switchTo().frame("AppFrmsFrame");
                    Driver1.switchTo().frame("ViewerFrmsFrame");
                    Driver1.switchTo().frame("MainFrame");
                    Driver1.switchTo().frame("body");
                    System.out.println(Driver1.getTitle());
                Thread.sleep(4000);
    }

    @Then("^User Type Qualite '(.+)'$")
    public void user_type_qualite_(String qualite) throws Throwable {
         WebElement Qualite =  Driver1.findElement(By.id("D*ZY07QUALIT-0-0_0"));
                 Qualite.sendKeys(qualite);
    }

    @Then("^User Type Nom '(.+)'$")
    public void user_type_nom_(String nom) throws Throwable {
        WebElement Nom =  Driver1.findElement(By.id("D*ZY07NOMUSE-0-0_0"));
                 Nom.sendKeys(nom);
    }

    @Then("^User Type Prenom '(.+)'$")
    public void user_type_prenom_(String prenom) throws Throwable {
          WebElement Prenom =  Driver1.findElement(By.id("D*ZY06PRENOM-0-0_0"));
                 Prenom.sendKeys(prenom);
    }

    @Then("^User Type Sexe '(.+)'$")
    public void user_type_sexe_(String sexe) throws Throwable {
       WebElement Sexe =  Driver1.findElement(By.id("D*ZY10SEXEMP-0-0_0"));
                 Sexe.sendKeys(sexe);
    }

    @Then("^User Type DateNaissance '(.+)'$")
    public void user_type_datenaissance_(String datenaissance) throws Throwable {
  WebElement DateN =  Driver1.findElement(By.id("D*ZY10DATNAI-0-0_0"));
                 DateN.sendKeys(datenaissance);
                 Thread.sleep(4000);
    }

    @Then("^User Switch Tab Affectation$")
    public void user_switch_tab_affectation() throws Throwable {
        Driver1.switchTo().defaultContent();
                    Driver1.switchTo().frame("technologyFrame");
                    
                    Driver1.switchTo().frame("OpFrmsFrame");                                        
                    Driver1.switchTo().frame("AppFrmsFrame");
                    Driver1.switchTo().frame("ViewerFrmsFrame");
                    Driver1.switchTo().frame("MainFrame");
                    Driver1.switchTo().frame("tabs");
                    System.out.println(Driver1.getTitle());
                     WebElement tab2 =  Driver1.findElement(By.id("Tab2off"));
                    tab2.click();
                Thread.sleep(1000);
       
    }

    @Then("^User Switch To Body of Tab Affectation$")
    public void user_switch_to_body_of_tab_affectation() throws Throwable {
                    Driver1.switchTo().defaultContent();
                    Driver1.switchTo().frame("technologyFrame");
                    
                    Driver1.switchTo().frame("OpFrmsFrame");                                        
                    Driver1.switchTo().frame("AppFrmsFrame");
                    Driver1.switchTo().frame("ViewerFrmsFrame");
              Driver1.switchTo().frame("MainFrame");
                 Driver1.switchTo().frame("body");    }

    @Then("^User Type CategoriEntree '(.+)'$")
    public void user_type_categorientree_(String categorientree) throws Throwable {
            Thread.sleep(1000);
         WebElement CatE =  Driver1.findElement(By.id("D*ZYESCGSTHI-0-0_0"));
                 CatE.sendKeys(categorientree);
    }

    @Then("^User Type MotifEntree '(.+)'$")
    public void user_type_motifentree_(String motifentree) throws Throwable {
                WebElement MotE =  Driver1.findElement(By.id("D*ZYESRSSTHI-0-0_0"));
                 MotE.sendKeys(motifentree);    }

    @Then("^User Type Emploi '(.+)'$")
    public void user_type_emploi_(String emploi) throws Throwable {
      WebElement Emploi =  Driver1.findElement(By.id("D*ZY3BIDJB00-0-0_0"));
                 Emploi.sendKeys(emploi);
    }

    @Then("^User Type UniteOrg '(.+)'$")
    public void user_type_uniteorg_(String uniteorganisationnelle) throws Throwable {
       WebElement UnitO =  Driver1.findElement(By.id("D*ZY3BIDOU00-0-0_0"));
                 UnitO.sendKeys(uniteorganisationnelle);
    }

    @Then("^User Type CalPaie '(.+)'$")
    public void user_type_calpaie_(String calpaie) throws Throwable {
         WebElement CalP =  Driver1.findElement(By.id("D*ZY5UIDGPCA-0-0_0"));
                 CalP.sendKeys(calpaie);
    }
    
    @Then("^User Type Code '(.+)'$")
    public void user_type_code_(String codecycletravail) throws Throwable {
         WebElement Code =  Driver1.findElement(By.id("D*ZY5GCODE-0-0_0"));
                 Code.sendKeys(codecycletravail);
                  Thread.sleep(4000);
    }

    @Then("^User Switch Tab Carriere$")
    public void user_switch_tab_carriere() throws Throwable {
       Driver1.switchTo().defaultContent();
                    Driver1.switchTo().frame("technologyFrame");
                    
                    Driver1.switchTo().frame("OpFrmsFrame");                                        
                    Driver1.switchTo().frame("AppFrmsFrame");
                    Driver1.switchTo().frame("ViewerFrmsFrame");
                    Driver1.switchTo().frame("MainFrame");
                    Driver1.switchTo().frame("tabs");
                     System.out.println(Driver1.getTitle());
                     WebElement tab3 =  Driver1.findElement(By.id("Tab3off"));
                    tab3.click();
                    Thread.sleep(4000);

    }

    @Then("^User Switch To Body of Tab Carriere$")
    public void user_switch_to_body_of_tab_carriere() throws Throwable {
        Driver1.switchTo().defaultContent();
                    Driver1.switchTo().frame("technologyFrame");
                    
                    Driver1.switchTo().frame("OpFrmsFrame");                                        
                    Driver1.switchTo().frame("AppFrmsFrame");
                    Driver1.switchTo().frame("ViewerFrmsFrame");
              Driver1.switchTo().frame("MainFrame");
                 Driver1.switchTo().frame("body");
    }
    
    @Then("^User Type CoCollective '(.+)'$")
    public void user_type_cocollective_(String conventioncollective) throws Throwable {
        WebElement ConvColl =  Driver1.findElement(By.id("D*ZYCACOCONV-0-0_0"));
                ConvColl.sendKeys(conventioncollective);
    }

    @Then("^User Type Qualification '(.+)'$")
    public void user_type_qualification_(String qualification) throws Throwable {
           WebElement Qual =  Driver1.findElement(By.id("D*ZYCAQUALIF-0-0_0"));
                Qual.sendKeys(qualification);
    }

    @Then("^User Type TypePaie '(.+)'$")
    public void user_type_typepaie_(String typepaie) throws Throwable {
            WebElement TypeP =  Driver1.findElement(By.id("D*ZYCATYPPAI-0-0_0"));
                TypeP.sendKeys(typepaie);
    }

    @Then("^User Type CodeGrade '(.+)'$")
    public void user_type_codegrade_(String codegrade) throws Throwable {
       WebElement CodeG =  Driver1.findElement(By.id("D*ZYCAGRCONV-0-0_0"));
                CodeG.sendKeys(codegrade);
    }

    @Then("^User Type NatureContrat '(.+)'$")
    public void user_type_naturecontrat_(String naturecontrat) throws Throwable {
         WebElement Nature =  Driver1.findElement(By.id("D*ZYCONATCON-0-0_0"));
                Nature.sendKeys(naturecontrat);
    }

    @Then("^User Type TypeContrat '(.+)'$")
    public void user_type_typecontrat_(String typecontrat) throws Throwable {
        WebElement TypeContrat =  Driver1.findElement(By.id("D*ZYCOTYPCON-0-0_0"));
                TypeContrat.sendKeys(typecontrat);
    }

    @Then("^User Type TypeTempsContractuel '(.+)'$")
    public void user_type_typetempscontractuel_(String typetempscontractuel) throws Throwable {
         WebElement TypeTc =  Driver1.findElement(By.id("D*ZYTLCODTRA-0-0_0"));
                TypeTc.sendKeys(typetempscontractuel);
    }

    @Then("^User Type HeurTrvailSemaine '(.+)'$")
    public void user_type_heurtrvailsemaine_(String heurtrvailsemaine) throws Throwable {
        WebElement Heure =  Driver1.findElement(By.id("D*ZYTLNBSTHW-0-0_0"));
                Heure.sendKeys(heurtrvailsemaine);
    }

    @Then("^User Type PourcentageTempsPlein '(.+)'$")
    public void user_type_pourcentagetempsplein_(String pourcentagetempsplein) throws Throwable {
       WebElement TempsPou =  Driver1.findElement(By.id("D*ZYTLRTSTHR-0-0_0"));
                TempsPou.sendKeys(pourcentagetempsplein);
    }

    @Then("^User Switch Tab SalaireEtPaiement$")
    public void user_switch_tab_salaireetpaiement() throws Throwable {
         Driver1.switchTo().defaultContent();
                    Driver1.switchTo().frame("technologyFrame");
                   
                    Driver1.switchTo().frame("OpFrmsFrame");                                        
                    Driver1.switchTo().frame("AppFrmsFrame");
                    Driver1.switchTo().frame("ViewerFrmsFrame");
                    Driver1.switchTo().frame("MainFrame");
                    Driver1.switchTo().frame("tabs");
                      System.out.println(Driver1.getTitle());
                     WebElement tab6 =  Driver1.findElement(By.id("Tab6off"));
                    tab6.click();
                     Thread.sleep(4000);
    }

    @Then("^User Switch To Body of Tab SalaireEtPaiement$")
    public void user_switch_to_body_of_tab_salaireetpaiement() throws Throwable {
        Driver1.switchTo().defaultContent();
                    Driver1.switchTo().frame("technologyFrame");

                    Driver1.switchTo().frame("OpFrmsFrame");                                        
                    Driver1.switchTo().frame("AppFrmsFrame");
                    Driver1.switchTo().frame("ViewerFrmsFrame");
              Driver1.switchTo().frame("MainFrame");
                 Driver1.switchTo().frame("body");
    }

    @Then("^User Type Rubrique '(.+)'$")
    public void user_type_rubrique_(String rubrique) throws Throwable {
       WebElement Rubrique =  Driver1.findElement(By.id("D*ZYAURUBAUG-0-0_0"));
                Rubrique.sendKeys(rubrique);
    }

    @Then("^User Type MontantSalarial '(.+)'$")
    public void user_type_montantsalarial_(String montantsalarial) throws Throwable {
        WebElement Montant =  Driver1.findElement(By.id("D*ZYAUMTSAL-0-0_0"));
                Montant.sendKeys(montantsalarial);
    }

    @Then("^User Type FreqPaie '(.+)'$")
    public void user_type_freqpaie_(String freqpaie) throws Throwable {
         WebElement FreqP =  Driver1.findElement(By.id("D*ZY13FREQUE-0-0_0"));
                FreqP.sendKeys(freqpaie);
    }

    @Then("^User Click On Soumettre$")
    public void user_click_on_soumettre_() throws Throwable {
        Thread.sleep(4000);
                    Driver1.switchTo().defaultContent();
                    Driver1.switchTo().frame("technologyFrame");
                    
                    Driver1.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver1.switchTo().frame("AppFrmsFrame");
                    Driver1.switchTo().frame("BannerFrame");
                   WebElement Commit =  Driver1.findElement(By.id("A*COMMIT_2"));
                Commit.click();
    }
    
@Then("^User Switch To Frametwo$")
   public void user_switch_to_frametwo() throws Throwable {
          Thread.sleep(1000);
                     Driver1.switchTo().defaultContent();
                                                      Thread.sleep(1000);

                    WebElement frame2 =Driver1.findElement(By.xpath("//iframe[@src='https://ppr-hiris.soprahronline.com/hr-rich-client/errorsDlg.html']"));
                        Driver1.switchTo().frame(frame2);
               
               //  WebElement Yesbutton =driver.findElement(By.id("yes_button"));
                  //      Yesbutton.click();

   
   
   }

}