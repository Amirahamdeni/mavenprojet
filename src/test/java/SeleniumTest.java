import java.util.List;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SeleniumTest {
    static WebDriver driver;
    final private String URL = "http://www.teknosa.com";

    @BeforeClass
    public static void setupTest() {
                  System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");

        driver = new ChromeDriver();
    }

    @Test
public void T01_findById() {
    //Navigate to Linkedin.com
    driver.navigate().to("https://www.linkedin.com/");
 
    //Find first name text box by By.id method
    WebElement firstNameTextBox = driver.findElement(By.id("reg-firstname"));
 
    //Assert that text box is empty
    assertThat(firstNameTextBox.getText(), is(""));
}
@Test
public void T01_findByName()
{

driver.navigate().to("https://www.linkedin.com/");
WebElement firstNameTextBox = driver.findElement(By.name("firstName"));
assertThat(firstNameTextBox.getText(),is(""));

}
@Test
public void T03_findLinkText() {
    //Navigate to Linkedin.com
    driver.navigate().to("https://www.linkedin.com/");

    //Find first name text box by By.LinkText method
    WebElement forgetPassLink = driver.findElement(By.linkText("Mot de passe oublié ?"));

    //Assert that text box is empty
    assertThat(forgetPassLink.getText(), is("Mot de passe oublié ?"));
}
@Test
public void T05_findclassName() {
    //Navigate to Linkedin.com
    driver.navigate().to("https://www.linkedin.com/");

    //Find first name text box by By.className method
    List<WebElement> textInputClasses  = driver.findElements(By.className("reg-firstname"));

    int textInputClassCount = textInputClasses.size();

    //Assert that text box is empty
    assertThat(textInputClassCount, is(1));
}
@Test
public void T01_firstNameCSSSelector() {
    //Navigate to Linkedin.com
    driver.navigate().to("https://www.linkedin.com/");
 
    //Find first name text box by CSS Selector
    //
    WebElement firstNameTextBox = driver.findElement(By.cssSelector("#reg-firstname"));
 
    //Assert that text box is empty
    assertThat(firstNameTextBox.getText(), is(""));}
    @AfterClass
    public static void quitDriver() {
  //  driver.quit();
    }
}