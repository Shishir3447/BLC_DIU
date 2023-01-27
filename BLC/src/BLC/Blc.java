package BLC;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Blc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver","C:\\selenium webdriver\\FirefoxDriver\\geckodriver-v0.32.0-win-aarch64\\geckodrive.exe");
		   FirefoxDriver driver = new FirefoxDriver();
		   driver.get("https://elearn.daffodilvarsity.edu.bd/");
		   driver.findElement(By.xpath("//body/nav[1]/div[2]/ul[3]/li[2]/div[1]/a[1]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Shishir");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
		   Thread.sleep(2000); 
		   driver.findElement(By.xpath("//button[@id='loginbtn']")).click();
		   Thread.sleep(2000); 
		   driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")).click();
		   Thread.sleep(2000); 
		   driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("shishir");
		   Thread.sleep(2000); 
		   driver.findElement(By.xpath("//input[@id='id_submitbuttonusername']")).click();
		   Thread.sleep(2000); 
		   driver.navigate().back();
		   driver.findElement(By.xpath("//input[@id='id_email']")).sendKeys("shishir@gmail.com");
		   Thread.sleep(2000); 
		   driver.findElement(By.xpath("//input[@id='id_submitbuttonemail']")).click();
		   Thread.sleep(2000);
		   driver.navigate().back();
		   driver.findElement(By.xpath("//body/nav[1]/div[2]/ul[3]/li[3]/a[1]")).click();
		   Thread.sleep(2000); 
		   driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("shishir");
		   driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("1235456");
		   driver.findElement(By.xpath("//input[@id='id_email']")).sendKeys("shishir@gfmail.com");
		   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[2]/div[1]/div[2]/div[2]/input[1]")).sendKeys("shishir@gmail.com");
		   
		   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/fieldset[2]/div[1]/div[2]/div[2]/input[1]")).sendKeys("shishir");
		   driver.findElement(By.xpath("//input[@id='id_lastname']")).sendKeys("shishir");
		   driver.findElement(By.xpath("//input[@id='id_lastname']")).sendKeys("Dhaka");
		   driver.findElement(By.xpath(" //select[@id='id_country']")).sendKeys("Bangladesh");
		   driver.findElement(By.xpath("//input[@id='id_submitbutton']")).click();
		   
		 ;
		 
		   
		   
	}

}
