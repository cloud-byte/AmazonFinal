import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.deloitte.test.amazon.configuracion.Configuracion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;
public class PRACTICA {

	/**
	 * @param args
	 */
	public static void main (String [] args) {
		// TODO Auto-generated constructor stub
		
		
		Configuracion conf = new Configuracion();
		WebDriver driver = conf.getDriver();
		JavascriptExecutor js = conf.getJs();
		
		
		driver.get("https://www.phptravels.net/");
		
		try {
			Thread.sleep(2);
			//Click al despegable
			
			//*[@id="dropdownCurrency"]
				driver.findElement(By.xpath("(//li[@id='dropdownCurrency'])[2]")).click();
		    //Click al SignUP
				driver.findElement(By.xpath("(//ul[@class='dropdown-menu'])[2]//li[2]")).click();
			//Rellena Datos
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/input")).sendKeys("98765432Gerar67do2");
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[4]/input")).sendKeys("98765432Castan67on2");
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[5]/input")).sendKeys("98765432654321154322155219767428");
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/input")).sendKeys("98765432gera6@de78121.co");
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[7]/input")).sendKeys("98765432Terryf6ile1327");
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/input")).sendKeys("98765432Terryf6ile1327");
			
			//SCROLL (BAJA PANTALLA PARA ALCANZAR OBJETOS)
				js.executeScript("window.scrollBy(0,1000)");
			
			//Botón SUBMIT
				driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
				Thread.sleep(2000);
			//Menu y Logout	
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")).click();
				driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/ul/li[2]/a")).click();
			// LOGUEO
				Thread.sleep(1000);
				driver.findElement(By.name("username")).sendKeys("98765432gera6@de78121.co");
				driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/div/div[2]/input")).sendKeys("98765432Terryf6ile1327");
				driver.findElement(By.xpath("//*[@id=\"remember-me\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
				Thread.sleep(1000);
				
			//Botón Profile
				driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[2]/div[2]/div/div[1]/ul/li[2]")).click();
				js.executeScript("window.scrollBy(0,750)");
				Thread.sleep(1000);
			
			//Actualizar Campos
				driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div[3]/div[2]/div[1]/div[2]/input")).sendKeys("Juan perro 6");
				driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div[3]/div[2]/div[2]/div[2]/input")).sendKeys("Queretaro");
				driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div[3]/div[2]/div[3]/div[2]/input")).sendKeys("Queretaro");
				driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div[3]/div[2]/div[4]/div[2]/input")).sendKeys("Queretaro");
				driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div[3]/div[2]/div[5]/div[2]/input")).sendKeys("76830");
				Thread.sleep(1000);
		
		    //DropList Mexico
				Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div[3]/div[2]/div[6]/div[2]/select")));
				drpCountry.selectByVisibleText("Mexico");
				Thread.sleep(1000);
			
			//CLick en SUBMIT
				driver.findElement(By.xpath("//*[@id=\"profilefrm\"]/div/div[3]/div[3]/button")).click();
				
				
			
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	}