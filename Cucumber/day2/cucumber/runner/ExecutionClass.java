package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import stepdef.BaseClass;
@CucumberOptions(features="src/main/java/features/createlead.feature",
glue="stepdef", monochrome=true//publish=true
//dryRun=true,snippets=SnippetType.CAMELCASE//to set the naming convention for method as camel case
//dryRun=true-To get the snippet for the undefined steps of your feature file
//tags=//"@Sanity"//this executes the particular scenario/feature step with the given tagname
//	"@sanity and @regression"	//when both the condition or true
//"@sanity or @regression"//supports anyone condition to be true
		//"not @smoke"		
		)
public class ExecutionClass extends BaseClass{
 
}

