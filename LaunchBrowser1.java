package loginpage.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
        driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("leaf");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("nonit");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("it");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("launchbrowser");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf123@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle(); 
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("leaftest");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("java");
		driver.findElement(By.linkText("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
	}

}
