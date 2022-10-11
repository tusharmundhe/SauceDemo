package com.SauceDemo.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class _2POMClassforHomePage 
{
	private WebDriver driver;
	private Select sl;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menubutton;
	
	public void menubuttonclick()
	{
		menubutton.click();
	}
	
	@FindBy(xpath="(//a[@class='bm-item menu-item'])[3]")
	private WebElement logoutbutton;
	
	public void logoutbuttonclick()
	{
		logoutbutton.click();
		
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocart;
	public void addtocartclick()
	{
		addtocart.click();
	}
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement basket;
	public void basketclick()
	{
		basket.click();
	}
	
	public String baskettext()
	{
		String actualresult=basket.getText();
		return actualresult;
		
	}
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	List<WebElement> allproduct;
	public void allproductclick()
	{
	for(WebElement i:allproduct)
	{
		i.click();
		
	}
	}
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement dropdown;
	
	public void dropdown()
	{
		dropdown.click();
		sl.selectByIndex(2);
	}
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	public void checkoutbuttonclick()
	{
		checkout.click();
	}
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/span")
	WebElement checkouttext;
	public String checkouttext()
	{
		String checkouttext1=checkouttext.getText();
		return checkouttext1;
	}
	
	
	public _2POMClassforHomePage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		sl=new Select(dropdown);
		
	}
	
	
	
	

}
