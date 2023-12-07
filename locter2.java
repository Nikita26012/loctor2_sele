package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locter2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://advertising.amazon.in/?ref=Amz.in");
		Thread.sleep(3000);
		WebElement l1=dr.findElement(By.xpath("//a[text()='Advertise Your Products']"));
		 l1.click();
		Thread.sleep(3000);
		  dr.findElement(By.id("//a[text()='Get started']")).click();
		Thread.sleep(3000);
		dr.findElement(By.id("//span[contains(text(),'Yes']")).click();
		Thread.sleep(3000);
		dr.findElement(By.id("//span[@class='gsi-form-button-text']")).click();
		Thread.sleep(3000);
		dr.findElement(By.id("//div[@id='gsh-form-questions']//button[2]")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//span[@class='gsh-form-button-text']")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//div[@class='sign-in-register-container']//ul//li[2]//a//span")).click();
		Thread.sleep(3000);
	}
}
	