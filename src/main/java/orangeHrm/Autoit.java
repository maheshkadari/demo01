package orangeHrm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Ganesh Automation\\Browsers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='uploadfile_0']")).click();
		Thread.sleep(2000);
		//Runtime.getRuntime().exec("E:\\Ganesh Automation\\Files\\Fileupload.exe");


	}

}
