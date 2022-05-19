package org.stepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class ReportingClass {
	
	
	public static void generateJVMReport(String json) {
		File f = new  File("C:\\Users\\Praveen Bpr\\Documents\\Eclipse workspace\\Cucumber1\\target");
		Configuration config = new Configuration(f,"SampleAdactin");
		config.addClassifications("Environment", "UAT");
		config.addClassifications("Website", "Adactin");
		config.addClassifications("Sprint", "10");
		config.addClassifications("Platform", "Win-10");
		config.addClassifications("Browser Version", "100.00.001");
		
		List<String> li = new ArrayList<>();
		li.add(json);
		
		ReportBuilder rb = new ReportBuilder(li, config);
		rb.generateReports();
		
		
		
	}

}
