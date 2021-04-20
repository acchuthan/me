package org.utilityclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreport {
public static void reportjvm(String jsonPath) {

	File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JvmReport");
	Configuration con=new Configuration(f,"Dealsdirect");
	
	List<String> li=new ArrayList<String>();
	li.add(jsonPath);
	
	ReportBuilder r=new ReportBuilder(li,con);
	r.generateReports();
}
}
