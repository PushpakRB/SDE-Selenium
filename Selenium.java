package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_folder\\chromedriver-win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.opencart.com/index.php?route=account/register");
		WebElement username= dr.findElement(By.xpath("//input[@id='input-username']"));
		username.sendKeys("pushpakoo7");
		dr.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Pushpak");
		dr.findElement(By.id("input-lastname")).sendKeys("Bavaskar");
		dr.findElement(By.xpath("//input[@id='input-email']")).sendKeys("PushpakRB@gmail.com");
		Select county=new Select(dr.findElement(By.xpath("//select[@id='input-country']")));
		county.selectByValue("India");
		dr.findElement(By.name("password")).sendKeys("push@123");
		dr.findElement(By.xpath("//body/div[@id='account-register']/div[@id='register']/div[1]/div[1]/form[1]/div[7]/button[1]")).click();
//-------------------Registration Done--------------------
		dr.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/div[1]/a[1]")).click();
		WebElement email=dr.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/div[1]/a[1]"));
		email.sendKeys("PushpakRB@gmail.com");
		System.out.println("The url of the site is : "+ dr.getCurrentUrl());
	}

}
