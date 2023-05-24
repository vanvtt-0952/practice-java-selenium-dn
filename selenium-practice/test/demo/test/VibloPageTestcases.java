package demo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import demo.objects.VibloPageObjects;

/*
 * Test với expected
 * gọi từng theo tác theo mô tả testcase  như click btn/ send value/ check message
 * -> gọi tương ứng các thao tác đã tạo sẵn ở PAGE cụ thể
 * Nhớ khởi tạo instance PAGE cụ thể để dùng
 * 
 */
public class VibloPageTestcases {

	VibloPageObjects vibloPage = null;

	@BeforeSuite
	public void initializeDriver() throws Exception {

		// Create object of HomePage Class
		vibloPage = new VibloPageObjects();
	}

	@Test
	public void inputEmailValue() throws Exception {
		// goi browser
		Thread.sleep(3000);
		// find email and send value
		vibloPage.sendValueForInputEmail("qqqq");

	}

	public void sendValueForEmail() {
		// this.driver = SetupDriver.buildSetupDriver();
		WebDriver dr = new FirefoxDriver();
		dr.get("htttp/.//"); // Initialise Elements
		dr.manage().window().maximize();

		WebElement inputEmail = vibloPage.findTxtObject("ByClassName", "/div/div/div/d");
		// =
		// dr.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[3]/form/div[1]/div/div/input"));
		inputEmail.sendKeys("aaaa");

		WebElement inputPassword = vibloPage.findTxtObject("ByCSS", "password");
	}
}
