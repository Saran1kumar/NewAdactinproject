package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@Login"),plugin={"pretty","json:target\\output.json"},
dryRun=false,features ="src\\test\\resources",glue ="org.stepdefinition")
public class TestRunnerclass {				
	
	@AfterClass
	public static void afterclass() {
					
		//class the jvm reprot(Generate)
		Reporting.generateJVMReport("C:\\Users\\ADMIN\\eclipse-workspace\\OMRBranchAdactinHotelAutomation\\target\\output.json");
   
		
	}
	
	//@Login or @SearchHotel or @SelectHotel or @BookHotel or @CancelBooking	
	//PD4K4AE69W
	//9D003AZOM7
	
}
