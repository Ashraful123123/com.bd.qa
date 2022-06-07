package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//@cucumberOptions giving us couple of option to run the test
@CucumberOptions(features = {"src/test/resources/Features"} ,//Give me the location of Feature folder
plugin = {"json:target/cucumber.json"},//What kind of report you want to genarate,as a json,and html
		//And Report will be store in Target Folder
//Plugin is responsible for reporting
glue = "StepDefination",
tags= {"@SearchFieldW3school"})
//Where your location of StepDefination for the Features
//We give the name of the Package where we store our step for feature


//=======We will write CucumberOption between my Package and Class======//
public class TestRunner extends AbstractTestNGCucumberTests{
//Now We will integrate The TestNg here
	//We Will Extend one of the TestNG Class(AbstractTestNGCucumberTests) given by Cucumber
	//How you integrate TestNg with TestRunnerClass?????
	//Answer:We integrate TestNg With TEstRunner Class by extending one of the class
	//Given by Cucumber
}
