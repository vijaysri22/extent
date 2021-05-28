/**
 * 
 */
package JS.extent;

import java.util.Random;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

/**
 * @author Vijay Srivastava
 *
 */
public class extenterportingmain {

	
	public static void main(String[] args) {
		System.out.println("Test");
		ExtentReports reports = new extentreportlib().createextentreport();
		ExtentTest test = reports.createTest("Test1");
		test.log(Status.INFO, "First Step");
		ExtentTest testtemp = test;
		ExtentTest child1 = test.createNode("1");
		child1.log(Status.PASS, "Pass Child" + 1);
		ExtentTest child2 = test.createNode("2");
		child2.log(Status.PASS, "Pass Child" + 2);
		reports.flush();
		
		
		for (int i = 0; i < 10; i++) {
			int rand_int1 = new Random().nextInt(10);
			System.out.println(rand_int1*100);
			
		}
		
		
	}
	
	
	
	
}
