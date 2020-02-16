package com.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.contactus_page;

public class Contactus_sd extends webdriverclass {
    public contactus_page spage = PageFactory.initElements(driver, contactus_page.class);

    @When("^I click on Contact us button on home page$")
    public void iClickOnContactUsButtonOnHomePage() {
        spage.ClickContactusbutton();

//        driver.findElement(By.linkText("Contact us")).click();
    }

    @And("^I select \"([^\"]*)\" as subject heading from drop down$")
    public void iSelectAsSubjectHeadingFromDropDown(String subjectheading) throws Throwable {
        spage.selectsubjectheading(subjectheading);
//        new Select(driver.findElement(By.id("id_contact"))).selectByVisibleText(subjectheading);
    }

    @Given("^I enter emailId as \"kalyani@gmail\\.com$")
    public void iEnterEmailIdAsKalyaniGmailCom() throws Throwable {
        spage.enteremailId();
//        driver.findElement(By.id("email")).sendKeys();

    }

    @And("^I enter order reference as \"([^\"]*)\"$")
    public void iEnterOrderReferenceAs(String orderreference) throws Throwable {
        driver.findElement(By.id("id_order")).sendKeys();
    }

    @And("^I enter message in message box$")
    public void iEnterMessageInMessageBox() {
        driver.findElement(By.id("message")).sendKeys();
    }

    @When("^I click on Send button$")
    public void iClickOnSendButton() {
        driver.findElement(By.name("submitMessage")).click();
    }
}
