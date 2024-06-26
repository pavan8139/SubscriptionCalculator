package com.crm.crm_hybridframework.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class SalesforceLogin {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","D://new selenium jars//chromedriver.exe");
   	    WebDriver driver = new ChromeDriver();
   	    driver.get("http://login.salesforce.com");
   	    
   	    WebElement usernameField = driver.findElement(By.id("username"));
   	    WebElement passwordField = driver.findElement(By.id("password"));
   	    
   	    if(usernameField!= null && passwordField!= null)
   	    {
   	    	System.out.println("Username and password fields found");
   	    }
   	    usernameField.sendKeys("Pavan@gmail.com");
   	    passwordField.sendKeys("testing123$");
   	    
   	    WebElement loginButton = driver.findElement(By.id("login"));
   	    loginButton.click();
   	    
   	    try {
   	    	Thread.sleep(5000);
   	    }catch(InterruptedException e) {
   	    	e.printStackTrace();
   	    }
   	    
   	    String currentUrl = driver.getCurrentUrl();
   	    if(currentUrl.contains("salesforce.com"))
   	    {
   	    	System.out.println("Login successful");
   	    }
   	    
   	    driver.quit();
   	    
	}
}
