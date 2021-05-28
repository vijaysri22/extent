/**
 * 
 */
package JS.extent;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



/**
 * @author Vijay Srivastava
 *
 */
public class extentreportlib {

	
	public ExtentReports createextentreport() {
		String path = System.getProperty("user.dir") + File.separator + "reports" + File.separator + "extentReport" + File.separator + 
			"report.html";
		System.out.println(path);
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path);
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setDocumentTitle(path);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setReportName(path);
		// report or build name
		htmlReporter.config().setReportName("Automation Test Report for ");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.flush();
		return extent;
		
	}
	
	
	
	
}
