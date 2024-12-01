package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
        (
        features=".//Features/Login.feature",
        
        glue="stepDefinitions", // here we have to specify where exactly our step definitions are implemented 
        
        dryRun=true, //without real execution, it will check whether every step has corresponding step method definition implemented or not 
        
        monochrome=true, // remove unnecessary characters from the console window 
        
        plugin= {"pretty", // it will give us the output in the console window very clearly  
        		"html:test-output"}, // if you want to add some report , it will create html report under folder called test-output will be generated later
	
        tags = ("@sanity, @regression")
        )

public class TestRun {
	

}
