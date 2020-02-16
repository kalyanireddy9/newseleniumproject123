package pages;

import com.stepdefinitions.webdriverclass;
import org.openqa.selenium.By;

public class createanaccount_page extends webdriverclass {


    public void clickcheckbox(String checkbox) {
        driver.findElement(By.id("newsletter")).click();
    }

    public void clickgroupbox(String title) {
        if (driver.findElement(By.name("id_gender")).isSelected() == true) {
        }
        else {
            driver.findElement(By.name("id_gender")).click();
        }
    }
}