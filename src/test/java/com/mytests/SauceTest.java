package com.mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucetst.base.BaseTets;

public class SauceTest extends BaseTets{
	
	public void doLogin()
	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
    @Test(priority = 2)
	public void checkInventoryItemTest()
	{
    	doLogin();
    	Assert.assertTrue(driver.findElements(By.cssSelector(".inventory_item")).size()==6);
    	
    	
	}
    @Test(priority = 1)
   	public void checkAddToCartButtonTest()
   	{
       	doLogin();
       	Assert.assertTrue(driver.findElements(By.xpath("//button[text()='Add to cart']")).size()==6);
       	
       	
   	}
}
