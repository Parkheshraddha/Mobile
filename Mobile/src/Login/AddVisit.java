package Login;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

 

public class AddVisit {
	
	public static AndroidDriver driver;
	
	public static void applaunch() throws MalformedURLException, InterruptedException {

		//File classpathRoot = new File(System.getProperty("user.dir"));
				File appDir = new File("D:\\Mobile automation\\fieldSense-test.apk");
				//System.out.println(classpathRoot);
				//File appDir = new File(classpathRoot, "/apkFiles/");
				System.out.println(appDir);
//				File app = new File(appDir, "fieldSense_test.apk");
//				System.out.println(app);
				
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Opp");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", appDir.getAbsolutePath());
		capabilities.setCapability("appPackage", "in.qlc.fieldsense");
		capabilities.setCapability("appActivity", "in.qlc.field.sense.SplashScreen");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElementById("in.qlc.fieldsense:id/edt_name_login").sendKeys("Shraddha.parkhe@qlc.in");
		driver.findElementById("in.qlc.fieldsense:id/edt_pass_login").sendKeys("qlc.in123");
		driver.findElementById("in.qlc.fieldsense:id/btn_submit_login").click();
		Thread.sleep(10000);
		
		 
		driver.findElementById("in.qlc.fieldsense:id/img_add_appoint").click();
	driver.findElementById("in.qlc.fieldsense:id/tvCustomerName").click();
	driver.findElementById("in.qlc.fieldsense:id/et_Search").sendKeys("qlc");
	Thread.sleep(4000);
	driver.findElementById("in.qlc.fieldsense:id/tvCustomerName").click();
	driver.findElementById("in.qlc.fieldsense:id/spn_purpose_dialog").click();

//driver.findElementByClassName("android.widget.CheckedTextView").click();
	driver.findElementByXPath("//android.widget.CheckedTextView[@text='Account Review']").click();
//driver.findElementById("in.qlc.fieldsense:id/edt_add_appointment_subject").sendKeys("Automation testing purpose");
driver.findElementById("in.qlc.fieldsense:id/iv_add_appointment_ok").click();
	Thread.sleep(8000);
	driver.findElementById("in.qlc.fieldsense:id/img_add_place").click();
	driver.findElementById("android:id/text1").click();
	Thread.sleep(1000);

}
}
