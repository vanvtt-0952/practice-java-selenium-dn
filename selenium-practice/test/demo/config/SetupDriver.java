package demo.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 *  khởi tạo driver
 *  có thể thêm method quit/close driver
 */
public class SetupDriver {
//	private WebDriver driver;
	
	public static WebDriver buildSetupDriver() {
		String pathGecko = "/home/vu.thi.tran.van/vanvtt/QA-CEV/repo/AutomationTestExample/src/main/lib/firefox/geckodriver";
		System.setProperty("webdriver.gecko.driver", pathGecko);
		return (WebDriver) new FirefoxDriver();
	}
	
}
