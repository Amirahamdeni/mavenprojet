/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ahamdeni
 */
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/"
       
        ,plugin = {"pretty", "json:target/cucumberP.json"}     
        ,tags = {"@CyclePaie"}
              
) 
public class paieRunnerTest {
    
}
