package orangeHrm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("E:\\Ganesh Automation\\Files\\Testdata1.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(fi);
		XSSFSheet sh= wb.getSheetAt(0);
		int rownum=sh.getLastRowNum();
		System.out.println(rownum);
		for(int i=1;i<=rownum;i++)
		{
			String st=sh.getRow(i).getCell(0).toString();
			String st1=sh.getRow(i).getCell(1).toString();
			System.setProperty("webdriver.chrome.driver","E:\\Ganesh Automation\\Browsers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(st);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(st1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title=driver.getCurrentUrl();
		System.out.println(title);
		if(title.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))
				{
			driver.findElement(By.xpath("(//li[@class='main-menu-first-level-list-item'])[1]")).click();
			System.out.println("test execution pass");
			sh.getRow(i).createCell(2).setCellValue("Pass");
			FileOutputStream fo=new FileOutputStream("E:\\Ganesh Automation\\Files\\Testdata1.xlsx");
			wb.write(fo);
			fo.close();
			
				}
		else
			
		{
			System.out.println("Test case failed");
			sh.getRow(i).createCell(2).setCellValue("Fail");
			FileOutputStream fo1=new FileOutputStream("E:\\Ganesh Automation\\Files\\Testdata1.xlsx");
			wb.write(fo1);
			fo1.close();
			
		}
		Thread.sleep(4000);

		driver.close();
		
	}

}}
