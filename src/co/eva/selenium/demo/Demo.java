package co.eva.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "X:\\program\\software\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("emailkamu");
		driver.findElement(By.name("pass")).sendKeys("passwordkamu");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(1000);	
		
		String at = driver.getTitle();
		String et = "facebook";
		
		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Succesfull");
		}else {
			System.out.println("Test UnSuccesfull");
		}
	}

}
