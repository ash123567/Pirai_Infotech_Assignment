package co.pirai.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {
	WebDriver driver;
	public void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\selenium\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("http://localhost/pirai/piraiinfotech.html");
			searchCourse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void searchCourse() {
		driver.findElement(By.name("id")).sendKeys("1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("name")).sendKeys("Karthick Ram");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("gender")).sendKeys("male");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("Patient-type")).sendKeys("ICU");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("email")).sendKeys("karthickram46631@gmail.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("phone")).sendKeys("7904840809");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("address")).sendKeys("2A");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("btn")).click();
	
		driver.findElement(By.name("id")).clear();
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("gender")).sendKeys("select gender");
		driver.findElement(By.name("Patient-type")).sendKeys("select patient type");
		
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("address")).clear();
	
		//second data
		
		driver.findElement(By.name("id")).sendKeys("2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("name")).sendKeys("Ram");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("gender")).sendKeys("male");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("Patient-type")).sendKeys("Out Patient");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("email")).sendKeys("gt60933@gmail.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("phone")).sendKeys("9659363808");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("address")).sendKeys("8r");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("btn")).click();
		
		driver.findElement(By.name("id")).clear();
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("gender")).sendKeys("Select gender");
		driver.findElement(By.name("Patient-type")).sendKeys("select patient type");
		
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("address")).clear();
		
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test myobj = new test();
		myobj.invokeBrowser();
	}

}
