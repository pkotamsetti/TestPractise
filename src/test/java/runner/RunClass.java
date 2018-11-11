package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		features = "Features", glue = { "stepDef" }, plugin = { "pretty",
				"html:target/html/automation", }

)


public class RunClass extends AbstractTestNGCucumberTests {
	
//	  private TestNGCucumberRunner testNGCucumberRunner;
//
//	    @BeforeClass(alwaysRun = true)
//	    public void setUpClass() throws Exception {
//	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//	    }
//
//	    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
//	    public void feature(CucumberFeatureWrapper cucumberFeature) {
//	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//	    }
//
//	    /**
//	     * @return returns two dimensional array of {@link CucumberFeatureWrapper} objects.
//	     */
//	    @DataProvider
//	    public Object[][] features() {
//	        return testNGCucumberRunner.provideFeatures();
//	    }
//
//	    @AfterClass(alwaysRun = true)
//	    public void tearDownClass() throws Exception {
//	        testNGCucumberRunner.finish();
//	    }

}
