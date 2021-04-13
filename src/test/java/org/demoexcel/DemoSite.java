package org.demoexcel;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class DemoSite extends DemoBaseClass {

	public static void main(String[] args) throws IOException {
		
		
		launchUrl("http://demo.automationtesting.in/Alerts.html");
		waitImplicit();
		browserMaximize();
		System.out.println( getTitle());
		System.out.println( getCurrentUrl());
		WebElement alertbtnXpath =  findelementXpath("//button[@onclick='alertbox()']");
		 clickAction(alertbtnXpath);
		Alert simpleAlert =  simpleAlert();
		simpleAlert.accept();
		WebElement confirmalertTab =  findelementXpath("//a[text()='Alert with OK & Cancel ']");
		 clickAction(confirmalertTab);
		WebElement confirmbtnXpath =  findelementXpath("//button[text()='click the button to display a confirm box ']");
		 clickAction(confirmbtnXpath);
		Alert confrimAlert =  confrimAlert();
		confrimAlert.dismiss();
		WebElement promptbtnTab =  findelementXpath("//a[text()='Alert with Textbox ']");
		 clickAction(promptbtnTab);
		WebElement promptbtnXpath =  findelementXpath("//button[@onclick='promptbox()']");
		 clickAction(promptbtnXpath);
		Alert promptAlert =  promptAlert();
		promptAlert.sendKeys("I miss home");
		promptAlert.accept();
		WebElement findelementXpath =  findelementXpath("//a[text()='SwitchTo']");
		 mouseHover(findelementXpath);
		WebElement windowtab =  findelementXpath("//a[text()='Windows']");
		 //TakeScreenshot();
		 clickAction(windowtab);
		WebElement frameName =  findelementXpath("//iframe[@title='Advertisement']");
		 switchFrame(frameName);
		WebElement buttonclose =  findelementId("dismiss-button");
		 clickAction(buttonclose);
		String title =  getTitle();
		System.out.println("Title of screen "+title);
		String currentUrl =  getCurrentUrl();
		System.out.println("Current URL of screen "+currentUrl);
		
	}

}
