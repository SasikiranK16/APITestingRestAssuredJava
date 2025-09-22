package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extents {
	
	public static final Logger logs = LoggerFactory.getLogger(Extents.class);
	public static ExtentReports extentReports;
	public static ExtentSparkReporter extentSparkReporter;
	public static File file;
	public static ExtentTest extentTest;
	public static Properties properties;
	public static FileInputStream fis;
	public static ExtentReports generateReports() {
		try {
			extentReports = new ExtentReports();
			logs.info("Extent Reports Activated!!");
			file = new File(System.getProperty("user.dir") + "\\extentReports\\one.html");
			logs.info("Successfully read every files");
			extentSparkReporter = new ExtentSparkReporter(file);
			logs.info("ExtentSpark Reporter Activated!!");
			extentReports.attachReporter(extentSparkReporter);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return extentReports;

	}
	public static Properties getProprProperties() {
		properties = new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\resources\\pro.properties");
			properties.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(System.getProperty("user.dir"));
		return properties;
	}
	
}
