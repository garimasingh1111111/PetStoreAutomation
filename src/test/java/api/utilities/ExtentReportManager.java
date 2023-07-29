//package api.utilities;
//
//import java.text.SimpleDateFormat;
//
//import org.apache.poi.hpsf.Date;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class ExtentReportManager implements ITestListener {
//	public ExtentSparkReporter sparkReporter;// responsible for ui of report
//	public ExtentReports extentReport;// user ,system info
//	public ExtentTest test;// responsible for making the entries in the report if any test failed or passed
//							// or sipped
//	String repName;
//
////below method is for practice only
//	public void OnStart1(ITestContext testContext) {
//
//		extentReport = new ExtentReports();
//		File extentReportFile = new File(System.getProperty("user.dir") + ".\\reports\\extentReport.html");
//		sparkReporter = new ExtentSparkReporter(extentReportFile);// specify
//		// the location of report
//		sparkReporter.config().setDocumentTitle("RestAssuredAutomationProject");// title of report
//		sparkReporter.config().setReportName("Pet store users api");// name of report
//		sparkReporter.config().setTheme(Theme.DARK);
//
//		extentReport.attachReporter(sparkReporter);
//		extentReport.setSystemInfo("Application", "Pet Store User API");
//		extentReport.setSystemInfo("Operating System", System.getProperty("os.name"));
//		extentReport.setSystemInfo("User Name", System.getProperty("user.name"));
//		extentReport.setSystemInfo("Environment", "QA");
//		extentReport.setSystemInfo("user", "Garima Singh");
//
//	}
//
//	public void OnStart(ITestContext testContext) {
//		extentReport = new ExtentReports();
//		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// timeStamp
//		repName = "Test-Report-" + timeStamp + ".html";
//		System.out.println("this is the test name :" + test);
//
//		sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);// specify
//		// the location of report
//		sparkReporter.config().setDocumentTitle("RestAssuredAutomationProject");// title of report
//		sparkReporter.config().setReportName("Pet store users api");// name of report
//		sparkReporter.config().setTheme(Theme.DARK);
//
//		// extentReport = new ExtentReports();
//		extentReport.attachReporter(sparkReporter);
//		extentReport.setSystemInfo("Application", "Pet Store User API");
//		extentReport.setSystemInfo("Operating System", System.getProperty("os.name"));
//		extentReport.setSystemInfo("User Name", System.getProperty("user.name"));
//		extentReport.setSystemInfo("Environment", "QA");
//		extentReport.setSystemInfo("user", "Garima Singh");
//
//	}
//
//	public void onTestSuccess(ITestResult result) {
//
//		test = extentReport.createTest(result.getName());
//		System.out.println("this is the test name :" + test);
//		test.assignCategory(result.getMethod().getGroups());
//		test.createNode(result.getName());
//
//	}
//
//	public void onTestFailure(ITestResult result) {
//		System.out.println("result    " + result);
//		test = extentReport.createTest(result.getName());
//		test.createNode(result.getName());
//		test.assignCategory(result.getMethod().getGroups());
//		test.log(Status.FAIL, "Test Failed");
//		test.log(Status.FAIL, result.getThrowable().getMessage());
//
//	}
//
//	public void onTestSkipped(ITestResult result) {
//		test = extentReport.createTest(result.getName());
//		test.createNode(result.getName());
//		test.assignCategory(result.getMethod().getGroups());
//		test.log(Status.SKIP, "Test Skipped");
//		test.log(Status.SKIP, result.getThrowable().getMessage());
//	}
//
//	public void onFinish(ITestContext testContext) {
//		extentReport.flush();// very imp it is called to generate the report.Always run the test with
//		// testng.xml otherwise you can not see the rreport.
//	}
//
//}
