package pages;

import com.stepdefinitions.webdriverclass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class contactus_page extends webdriverclass {

    public void ClickContactusbutton() {
        driver.findElement(By.linkText("Contact us")).click();
    }

    public void enteremailId() {
        driver.findElement(By.id("email")).sendKeys();

    }

    public void selectsubjectheading(String subjectheading) {
        new Select(driver.findElement(By.id("id_contact"))).selectByVisibleText(subjectheading);

    }
}