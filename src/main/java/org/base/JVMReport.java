package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	
	public static void generateJVMReport(String json) {

		File loc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
		
		Configuration con=new Configuration(loc, "Greenkart");
		con.addClassifications("Environment", "QA");
		con.addClassifications("Sprint", "20");
		con.addClassifications("platform", "Windows");
		con.addClassifications("Version", "10");
		
		List<String> jsons=new LinkedList<String>();
		jsons.add(json);
		
		ReportBuilder rb=new ReportBuilder(jsons, con);
		rb.generateReports();
		
	}

}
