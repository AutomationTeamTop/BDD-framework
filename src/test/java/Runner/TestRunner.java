package Runner;



import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(features="src/test/java/features/Login.feature"
	,glue={"stepDefinitions"}
	,monochrome=true
	,plugin={"pretty","json:target/cucumber.json"},tags= "@smoke or @sanity"
	)
public class TestRunner extends BaseTest {
	
	
	

}
