package demo.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import demo.config.SetupDriver;
/* 
 * Thao tác tại chính page này
 * tận dụng thêm các method đa được định nghĩa ở BasicOject
 * các thao tác riêng chỉ có ở page này thì tự bổ sung method
 */
public class VibloPageObjects extends BasicObject{
	String URL = "https://accounts.viblo.asia/login";
	
	public VibloPageObjects() throws Exception {
		
		this.driver = SetupDriver.buildSetupDriver();
				
		driver.get(URL); // Initialise Elements
		driver.manage().window().maximize(); // full screen
	}

	public void sendValueForInputEmail(String email) {
		WebElement inputEmail = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[3]/form/div[1]/div/div/input"));
		inputEmail.sendKeys(email);
	}
}
