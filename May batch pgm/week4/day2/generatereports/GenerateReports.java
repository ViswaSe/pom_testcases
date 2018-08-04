package week4.day2.generatereports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateReports {

	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter html=new ExtentHtmlReporter("./report/result.html");
		html.setAppendExisting(true);
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test=extent.createTest("TS_001_Create Lead","Create a lead in test leaf");
		test.assignAuthor("Viswa");
		test.assignCategory("smoke");
		test.pass("Browser invoked successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/CreateLeadNewSnaps/img1.png").build());
		test.pass("Username entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/CreateLeadNewSnaps/img2.png").build());
		test.pass("Password entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/CreateLeadNewSnaps/img3.png").build());
		extent.flush();
	}

}
