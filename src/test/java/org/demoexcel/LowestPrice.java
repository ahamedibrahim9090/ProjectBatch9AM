package org.demoexcel;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LowestPrice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/index.php");
		WebElement findElement = driver.findElement(By.name("fromPort"));
		Select select = new Select(findElement);
		select.selectByVisibleText("Philadelphia");
		WebElement findElement2 = driver.findElement(By.name("toPort"));
		Select select1 =  new Select(findElement2);
		select1.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='table']"));
		List<WebElement> elements = table.findElements(By.tagName("td"));
		List<String> price = new LinkedList<String>();
		for(int i = 0;i<elements.size();i++)
		{
			String text = elements.get(i).getText();
			if(text.contains("$"))
			{
				price.add(text);
			}
		}
		System.out.println(price);
		List<Float> convPrice = new LinkedList<Float>();
		float lowPrice = 0;
		int position = 0;
		for(int j = 0;j<price.size();j++)
		{
			String number = price.get(j);
			String replace = number.replace('$','0');
			float check = Float.parseFloat(replace);
			convPrice.add(check);
		}
		System.out.println(convPrice);
		for(int i = 0;i<convPrice.size();i++)
		{
			float price1 = convPrice.get(i);
			for(int j = i+1;j<convPrice.size();j++)
			{
				float price2 = convPrice.get(j);
				if(price1<price2)
				{
					lowPrice = price1;
					position = i;
				}
			}
		}
		System.out.println("low price "+lowPrice+"\n Position "+position);
	}
	
}
