package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LauchBrowserActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		String title=driver.getTitle();
		System.out.println(title);

		

	}

}
