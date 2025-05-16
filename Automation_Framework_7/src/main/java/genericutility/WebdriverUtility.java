package genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();		
	}
	
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();	
	}
	
	public void rightClick(WebDriver driver, WebElement element) {
		Actions act= new Actions(driver);
		act.contextClick().perform();
	}
	
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act= new Actions(driver);
		act.doubleClick().perform();
	}
	
	public void dragAndDrop(WebDriver driver,WebElement elementtobedraged, WebElement elementdestination ) {
		Actions act= new Actions(driver);
		act.dragAndDrop(elementtobedraged, elementdestination);
	}
	
	public void switchToFrame(WebDriver driver,int index) {
	driver.switchTo().frame(index);
	}
	
	public void switchToFrame(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void switchBackToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void getPhoto(WebDriver driver ) throws IOException {
		JavaUtility jUtil=new JavaUtility();
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+jUtil.getSystemTime()+".png");
		FileHandler.copy(temp, dest);
	}
	
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	public void selectDropdown(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectDropdown(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectDropdownByText(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
}