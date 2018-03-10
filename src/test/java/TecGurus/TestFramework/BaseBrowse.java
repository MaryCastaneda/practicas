package TecGurus.TestFramework;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseBrowse {
	
		private WebDriver mydriver;
		
		
		public WebDriver SetUpDriver(String url)
		{
			  System.setProperty("webdriver.chrome.driver",System.getenv("CHROMEDRIVER"));
			  mydriver = new ChromeDriver();
			  mydriver.manage().window().maximize();
			  mydriver.get(url);
			  return mydriver;
		}
		
		public void GoTo() {
			 mydriver.get("https://www.amazon.com.mx/");
		  }
		
		public void Click(WebElement element)
		{
			element.click();
		}
		
		public void EnterText(WebElement elemento, String value)
		{
			elemento.sendKeys(value);
		}
		
		public void AsserElement(WebElement element, String Elemento)
		{
			System.out.println(Elemento);
			boolean isDisplayed = false;
			int counter = 0;
			while(!isDisplayed && counter < 10)
			{
				try
				{
					isDisplayed = element.isDisplayed();
				}
				
				catch(NoSuchElementException e)
				{
					System.out.println("Element not found ... searching");
				}
			}
			
		}
	//Crear DriverSetUp
	
	//Crear GoTo();
	
	//Crear Click
	
	//Crear EnterText -- Send Keys
	
	//Crear AsserElement

}
