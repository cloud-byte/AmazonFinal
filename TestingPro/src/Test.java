
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;
public class Test {

	/**
	 * @param argsguiuyiyuyu
	 */
	public static void main (String [] args) {
		// TODO Auto-generated constructor stub
		String path = System.getProperty("user.home");
		String chromeDriverPath= path+"\\Documents\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.phptravels.net/");
		
		try {
			Thread.sleep(2);
			driver.findElement(By.xpath("(//li[@id='li_myaccount'])[2]")).click();
			Thread.sleep(2);
			driver.findElement(By.xpath("(//ul[@class='dropdown-menu'])[2]//li[1]")).click();
			driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
			
			//driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[1]/input")).sendKeys("user@phptravels.net"); //driver.findElement(By.id("username")); Por ID
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys("demouser");
			driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
			
			//*[@id="loginfrm"]/button
			
			/*
			 * driver.findElement(By.xpath("//*[@id=\"li_myaccount\"]/a")).click();
			 * 
			 * driver.findElement(By.xpath("//*[@id=\"li_myaccount\"]/ul/li[1]/a")).click();
			 */
			
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		//TIPOS DE ASSERT
		//TIPOS DE WAITS
		
		
		
		
		
		
		
		
		/*
		 * String error= driver.findElement(By.id("error")).getText();
		 * 
		 * System.out.println(error);
		 */
		
		
		
		
		
		//driver.close();//driver.quit(); TODAS
		
		
		
		
	}

}
