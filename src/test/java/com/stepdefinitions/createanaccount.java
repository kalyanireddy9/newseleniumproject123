package com.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.createanaccount_page;

public class createanaccount extends webdriverclass{
    public createanaccount_page regpage = PageFactory.initElements(driver, createanaccount_page.class);

    @When("^I click on sign in button on home page$")
    public void iClickOnSignInButtonOnHomePage() {
        driver.findElement(By.linkText("Sign in")).click();
    }

    @Given("^I enter emailId as \"([^\"]*)\" in create an account page$")
    public void iEnterEmailIdAsInCreateAnAccountPage(String emailId) throws Throwable {
        driver.findElement(By.id("email_create")).sendKeys(emailId);


    }

    @And("^I click on Create an account button$")
    public void iClickOnCreateAnAccountButton() throws InterruptedException {
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(5000);
    }

    @And("^I enter below details:$")
    public void iEnterBelowDetails(DataTable table) {
//        driver.findElement(By.id("customer_firstname")).sendKeys(table.getGherkinRows().get(0).getCells().get(0));
        System.out.println(table.getGherkinRows().get(1).getCells().get(3));
        String dob = table.getGherkinRows().get(1).getCells().get(3);
        dob.split("/");
        String[] dob1 = dob.split("/");
        new Select(driver.findElement(By.id("days"))).selectByValue(dob1[0]);
        new Select(driver.findElement(By.id("months"))).selectByValue(dob1[1]);
        new Select(driver.findElement(By.id("years"))).selectByValue(dob1[2]);

    }


    @When("^I click on \"([^\"]*)\" check box$")
    public void iClickOnCheckBox(String checkbox) throws Throwable {
        regpage.clickcheckbox(checkbox);

    }

    @When("^I select \"([^\"]*)\" on title$")
    public void iSelectOnTitle(String title) throws Throwable {
        regpage.clickgroupbox(title);

    }
}
