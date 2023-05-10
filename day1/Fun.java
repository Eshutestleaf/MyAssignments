package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://southernprotech.com/");
 driver.findElement(By.id("input1")).sendKeys("eshuveda@gmail.com");
 driver.findElement(By.partialLinkText("Sign up")).click();
 
	}

	

}
