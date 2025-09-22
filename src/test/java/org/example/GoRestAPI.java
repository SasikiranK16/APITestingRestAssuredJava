package org.example;

import java.awt.Desktop;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import org.hamcrest.*;
import static org.hamcrest.Matcher.*;

public class GoRestAPI extends Extents {
	public Response response;


	@BeforeSuite
	public void launch() {
		generateReports();
		getProprProperties();
	}

	@AfterSuite
	public void showReports() {
		extentReports.flush();
		try {
			Desktop.getDesktop().browse(file.toURI());
			logs.info("Desktop Activated!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void listUsers() throws Exception {
	
		extentTest = extentReports.createTest("List Users");
		extentTest.assignAuthor("Sasikiran Kakara");
		extentTest.assignCategory("API Automation");
		extentTest.assignDevice("Desktop");
		response = given().baseUri("https://gorest.co.in/public/v2").auth()
				.oauth2(properties.getProperty("token"))
				.contentType(ContentType.JSON).when().get("/users").then().extract().response();
		extentTest.log(Status.PASS, MarkupHelper.createCodeBlock(response.asPrettyString(),CodeLanguage.JSON));
		
	}
	
}
