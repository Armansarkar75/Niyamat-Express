import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OutreFunctionalautomationTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.niyamatexpress.com/");
		
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("from_name")).sendKeys("arman");
		Thread.sleep(2000);
		driver.findElement(By.name("from_email")).sendKeys("arman@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("message")).sendKeys("I want to contace with you");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[4]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tracking-search")).sendKeys("cn1234567890");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/form/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/ul/li[6]/a")).click();
		driver.findElement(By.id("email")).sendKeys("test1@rest.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("QWEqwe123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/form/div[2]/button")).click();
		driver.findElement(By.name("YourName")).sendKeys("Arman");
		driver.findElement(By.name("contactNumber")).sendKeys("01311848915");
		driver.findElement(By.name("FatherName")).sendKeys("Emdadul");
		driver.findElement(By.name("MotherName")).sendKeys("Asia");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div/div/div[1]/div[1]/div[5]/input")).click();
		
		
		
		
		
		
		

	}

}
