package practise;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReports {

	@BeforeMethod
	public void prepareReport() throws IOException
	{
		String path="./report/sample.html";
		ExtentHtmlReporter html=new ExtentHtmlReporter(path);
		html.setAppendExisting(true);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test=extent.createTest("Sample_001", "Sample Test case");
		test.pass("pass",MediaEntityBuilder.createScreenCaptureFromPath("/../snaps/Learning/img0.png").build());
		
		extent.flush();
		
	}
}
