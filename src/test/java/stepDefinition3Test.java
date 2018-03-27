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
public class stepDefinition3Test {
    
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.out.println("*******************");
		System.out.println("launching IEEEEEEEEEEE browser");
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
                    //   driver.findElement(By.id("NavMenu1")).click();
                  //  driver.findElement(By.id("NavMenu2")).click();
                  //  driver.findElement(By.id("NavMenu3")).click();


}

	@AfterClass
	public static void tearDown() {
				System.out.println("*******************");

		//	driver.quit();
		
	}
}
