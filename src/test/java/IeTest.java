/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import static java.sql.DriverManager.println;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author ahamdeni
 */
public class IeTest {
    //@Test
    // public void setupTest() {

   // System.out.println("Internet Explorer is selected");
//System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");

//WebDriver driver = new InternetExplorerDriver();
//DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
//cap.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,"https://ppr-hiris.soprahronline.com/hra-space/portal");
//driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal"); 
  //driver.navigate().to("http://www.yahoo.com");  
 // driver.manage().window().maximize();
   // driver.get("http:\\\\gmail.com"); 
  

 //driver.get("http://www.yahoo.com");  
    //remote = new RemoteWebDriver(new URL("http://localhost:5555/"), dc) 
    //remote = new InternetExplorerDriver(dc)
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.out.println("*******************");
		System.out.println("launching IE browser");
		System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe ");
		
	}

	@Test
	public void testGooglePageTitleInIEBrowser() {
            driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://ppr-hiris.soprahronline.com/hra-space/portal");
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
                //	Assert.assertTrue(strPageTitle.contains("Google"), "Page title doesn't match");
                    WebElement firstNameTextBox = driver.findElement(By.id("loginid"));
                    firstNameTextBox.sendKeys("TYOUSFI");
                    WebElement PasswordTextBox = driver.findElement(By.id("password"));
                    PasswordTextBox.sendKeys("HRA");
                    driver.findElement(By.className("hrportal-self-submit-center")).click();
                    driver.findElement(By.className("hrsp_root_label")).click();
                    


}

	@AfterClass
	public static void tearDown() {
				System.out.println("*******************");

		//	driver.quit();
		
	}
}
