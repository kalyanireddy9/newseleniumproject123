package com.stepdefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class webdriverclass {
public static  WebDriver driver;

public void openBrowser() throws IOException {

    String browser = System.getProperty("browser");

    if (browser.equalsIgnoreCase("CHROME")) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    } else if (browser.equalsIgnoreCase("FIREFOX")) {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }

    driver.manage().window().maximize();

//
//




    driver.get("http://automationpractice.com/index.php");
}
public void closebrowser() {

    driver.quit();
}


}
