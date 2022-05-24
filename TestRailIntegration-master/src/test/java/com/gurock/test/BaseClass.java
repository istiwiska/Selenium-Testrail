package com.gurock.test;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.gurock.testrail.APIException;

public class BaseClass{
	protected String TestcaseID;
	
	@AfterMethod

	protected void tearDown(ITestResult result) throws IOException, APIException{

		if(result.getStatus()==ITestResult.SUCCESS) {

			TestRailManager.addResultForTestCase(TestcaseID, TestRailManager.TEST_CASE_PASSED_STATUS, "");

		}

		else if(result.getStatus()==ITestResult.FAILURE) {

			TestRailManager.addResultForTestCase(TestcaseID, TestRailManager.TEST_CASE_FAILED_STATUS, result.getName().toString());

		}


	}
}