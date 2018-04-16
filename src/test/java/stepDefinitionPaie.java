







import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class stepDefinitionPaie {
      public WebDriver Driver2;
    
		   
   
    	
  
    @Given("^User Is On HomePagePaie$")
    public void user_Is_On_HomePage() throws Throwable {
         System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe ");
                  Driver2 = new InternetExplorerDriver();
        
                Driver2.manage().window().maximize();
		Driver2.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal");
              Driver2.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
                 Driver2.manage().timeouts().setScriptTimeout(100,TimeUnit.SECONDS);
		String strPageTitle = Driver2.getTitle();
		System.out.println("Page title: - "+strPageTitle);
    }
    @When("^User Enters Name And Password Paie$")
    public void user_Enters_Name_And_Password() throws Throwable {
       
    
         
         WebElement firstNameTextBox = Driver2.findElement(By.id("loginid"));
                    firstNameTextBox.sendKeys("TYOUSFI");
                   
                    WebElement PasswordTextBox = Driver2.findElement(By.id("password"));
                    PasswordTextBox.sendKeys("HRA");
                    
                     WebElement Connex = Driver2.findElement(By.className("hrportal-self-submit-center"));
                     Connex.click();  
                       Thread.sleep(1000);
                        WebElement Menu=  Driver2.findElement(By.className("hrsp_root_label"));
                    Menu.click();
         
    }
    @Then("^User Click on CalculerPaie$")
    public void user_navigate_to_click_on_calculpaie_() throws Throwable {
        
                 
                    
                      Thread.sleep(1000);
                      WebElement Paie = Driver2.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
                      Paie.click();
                     
                      WebElement SoumCycle = Driver2.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/div/div"));
                      SoumCycle.click();
                     
                       WebElement CalculPaie= Driver2.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/ul/li[1]/div/div[1]"));
                      CalculPaie.click();
    }
    @Then("^User Switch To BannerFrame$")
    public void user_switch_to_bannerframe() throws Throwable {
     Driver2.switchTo().defaultContent();
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("BannerFrame");
    }
    @Then("^User Type Demande$")
    public void user_type_demande_() throws Throwable {
         WebElement Demande= Driver2.findElement(By.id("PROMPT-1-1"));
                      Demande.sendKeys("%AMIRA%");
    }
    @Then("^User Click On Recherche$")
    public void user_click_on_recherche() throws Throwable {
        WebElement Recherche= Driver2.findElement(By.xpath("//*[@id=\"HRDSEL_1\"]/table/tbody/tr/td/table/tbody/tr[4]/td[6]/input"));
                      Recherche.click();
    }
    @Then("^User Switch ListView$")
    public void user_switch_listview() throws Throwable {
       Driver2.switchTo().defaultContent();
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver2.switchTo().frame("AppFrmsFrame");
                    
                    Driver2.switchTo().frame("ViewerFrmsFrame");
                    Driver2.switchTo().frame("ViewerFrame");
                     Driver2.switchTo().frame("body");
                       Driver2.switchTo().frame("ListView");
    }
    @Then("^User Click On PaieChoisie$")
    public void user_click_on_paiechoisie() throws Throwable {
        WebElement PaieChoisie= Driver2.findElement(By.id("ZO00LISOUM"));
                      PaieChoisie.click();
    }
    @Then("^User Switch To Bodyone$")
    public void user_switch_to_bodyone() throws Throwable {
         Driver2.switchTo().defaultContent();
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("ViewerFrmsFrame");
                    Driver2.switchTo().frame("MainFrame");
                    Driver2.switchTo().frame("body");
    }
     @Then("^User Type Travail$")
    public void user_type_travail_() throws Throwable {
    WebElement Travail = Driver2.findElement(By.id("D*ZO00IDFJOB-0-0_0"));
                    Travail.sendKeys("11");
    }
    @Then("^User Switch Tab Editions$")
    public void user_switch_tab_editions() throws Throwable {
      Driver2.switchTo().defaultContent();
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("ViewerFrmsFrame");
                    Driver2.switchTo().frame("MainFrame");
                    Driver2.switchTo().frame("tabs");
                  
                     WebElement tab2 =  Driver2.findElement(By.id("Tab2off"));
                    tab2.click();
    }
     @Then("^User Switch To Bodytwo$")
    public void user_switch_to_bodytwo() throws Throwable {
         Driver2.switchTo().defaultContent();
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("ViewerFrmsFrame");
                    Driver2.switchTo().frame("MainFrame");
                    Driver2.switchTo().frame("body");
       
    }
    @Then("^User Switch To Tab Preselection$")
    public void user_switch_to_tab_preselection() throws Throwable {
       Driver2.switchTo().defaultContent();
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("ViewerFrmsFrame");
                    Driver2.switchTo().frame("MainFrame");
                    Driver2.switchTo().frame("tabs");
                     WebElement tab3 =  Driver2.findElement(By.id("Tab3off"));
                    tab3.click();
    }
     @Then("^User Switch To Bodythree$")
    public void user_switch_to_body3() throws Throwable {
           Driver2.switchTo().defaultContent();
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("ViewerFrmsFrame");
                    Driver2.switchTo().frame("MainFrame");
                    Driver2.switchTo().frame("body");
       
    }
     @Then("^User Enters Sql Code$")
    public void user_enters_sql_code() throws Throwable {
         WebElement Sql = Driver2.findElement(By.id("D*ZO5WZOREQU-0-0_0"));
                    Sql.clear();
                    Sql.sendKeys("select nudoss from zy00 where matcle in('M0000009')");
    }
    @Then("^User Switch To BannerFrameoneP$")
    public void user_switch_to_bannerframeone() throws Throwable {
       Driver2.switchTo().defaultContent();
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("BannerFrame");
    }
     @Then("^User Click On SoumettreP$")
    public void user_click_on_soumettre() throws Throwable {
         WebElement Commit =  Driver2.findElement(By.id("A*COMMIT_2"));
                 Commit.click();
    }
     @Then("^User Navigate To Cick On Bulletin$")
    public void user_navigate_to_cick_on_bulletin() throws Throwable {
      Driver2.switchTo().defaultContent();
                  WebElement Menu2=  Driver2.findElement(By.className("hrsp_root_label"));
                    Menu2.click();
                    
                    
                      WebElement Paie2 = Driver2.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
                      Paie2.click();
                     
                      WebElement VoirRes = Driver2.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[1]/div"));
                      VoirRes.click();
                     WebElement Bulletin= Driver2.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[1]/ul/li[1]/div/div[1]"));
                   Bulletin.click();
    }
    @Then("^User Switch To BannerFrametwo$")
    public void user_switch_to_bannerframetwo() throws Throwable {
        Thread.sleep(2000);
                    Driver2.switchTo().defaultContent().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("BannerFrame");
    }
     @Then("^User Type Matricule$")
    public void user_type_matricule_() throws Throwable {
        WebElement Matricule= Driver2.findElement(By.id("PROMPT-1-1"));
                      Matricule.sendKeys("M0000009");
    }
     @Then("^User Click On Recherchetwo$")
    public void user_click_on_recherche2() throws Throwable {
          WebElement Recherche2= Driver2.findElement(By.xpath("//*[@id=\"HRDSEL_1\"]/table/tbody/tr/td/table/tbody/tr[4]/td[14]/input"));
                      Recherche2.click(); 
    }
    
    @Then("^User Switch To Bodyfour$")
    public void user_switch_to_body4() throws Throwable {
          Driver2.switchTo().defaultContent();
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("ViewerFrmsFrame");
                    Driver2.switchTo().frame("MainFrame");
                    Driver2.switchTo().frame("body");
        
    }
    
     @Then("^User Change Etat Temoin$")
    public void user_change_etat_temoin() throws Throwable {
         WebElement dropdown = Driver2.findElement(By.xpath("//*[@id=\"D*ZX5VVALIDT-0-0_0\"]/option[3]"));
                    dropdown.click();
                      
    }
    @Then("^User Switch To BannerFramethree$")
    public void user_switch_to_bannerframethree() throws Throwable {
        WebElement dropdown = Driver2.findElement(By.xpath("//*[@id=\"D*ZX5VVALIDT-0-0_0\"]/option[3]"));
                    dropdown.click();
                       Driver2.switchTo().defaultContent();
                    Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("BannerFrame");
    }
    @Then("^User Click On Soumettretwo$")
    public void user_click_on_soumettretwo() throws Throwable {
       WebElement Commit3 =  Driver2.findElement(By.id("A*COMMIT_1"));
                 Commit3.click();
    }
    @Then("^User Confirm Paie$")
    public void user_confirm_paie() throws Throwable {
        Driver2.switchTo().defaultContent();

                         WebElement Menu3=  Driver2.findElement(By.className("hrsp_root_label"));
                        Menu3.click();
                   
                      Thread.sleep(1000);
                      WebElement Paie3 = Driver2.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/div/div"));
                      Paie3.click();
                     
                      WebElement SoumCycle3 = Driver2.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/div/div"));
                      SoumCycle3.click();
                      
                       WebElement CalculP= Driver2.findElement(By.xpath("//*[@id=\"hrsp_menu\"]/li/ul/li[10]/ul/li[3]/ul/li[1]/div/div[1]"));
                      CalculP.click();
                  try { 
    Alert alert = Driver2.switchTo().alert();
    alert.accept();
    //if alert present, accept and move on.
}
catch (NoAlertPresentException e) {
  
                  Driver2.switchTo().defaultContent();
                 Driver2.navigate().refresh();
                       Driver2.switchTo().frame("technologyFrame");
                    
                    Driver2.switchTo().frame("OpFrmsFrame");                                        
                 
                    Driver2.switchTo().frame("AppFrmsFrame");
                    Driver2.switchTo().frame("BannerFrame");
                    
                 WebElement DemandeF= Driver2.findElement(By.id("PROMPT-1-1"));
                      DemandeF.sendKeys("%AMIRA%");
                      WebElement RechercheF= Driver2.findElement(By.xpath("//*[@id=\"HRDSEL_1\"]/table/tbody/tr/td/table/tbody/tr[4]/td[6]/input"));
                      RechercheF.click();  
                       
                    
                      WebElement ExeDemandeP= Driver2.findElement(By.xpath("//*[@id=\"Z*SubBtn\"]"));
                     ExeDemandeP.click();
                     Driver2.switchTo().alert().accept();
                      WebElement Resultat= Driver2.findElement(By.xpath("//*[@id=\"Z*Results\"]"));
                     Resultat.click();
                         Thread.sleep(2000);
                                             Driver2.switchTo().defaultContent();

                    WebElement frame=Driver2.findElement(By.xpath("//iframe[@src='https://ppr-hiris.soprahronline.com/hr-rich-client/hrservlet/GetHRPage?TREE=TA0FR&LANG=F&NODE=TA0FR0CT_AB4K3W0X&VOC=FRP&PAGE=ACTION&IDENT=23A82D56-AA6F-465A-9779-FC39D6B47BC3']"));
                        Driver2.switchTo().frame(frame);
                           Thread.sleep(2000);
                            WebElement Refresh= Driver2.findElement(By.xpath("//*[@id=\"POPUP_BANNER\"]/table/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"));
                     Refresh.click();
    }
    
    
}}