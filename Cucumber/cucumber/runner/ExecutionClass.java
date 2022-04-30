package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features=
"src/main/java/features/login.feature",
glue="stepdef", monochrome=true,publish=true
//dryRun=true-To get the snippet for the undefined steps of your feature file
)
public class ExecutionClass extends AbstractTestNGCucumberTests{
 
}
