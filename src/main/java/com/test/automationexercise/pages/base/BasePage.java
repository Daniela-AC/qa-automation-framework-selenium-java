package com.test.automationexercise.pages.base;

import com.test.automationexercise.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

    protected WebDriver driver;
    protected WaitUtils wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    protected void selectDataByValue(By locator, String value) {
        WebElement dropdownElement = wait.untilClickable(locator);
        Select element = new Select(dropdownElement);
        element.selectByValue(value);
    }

    protected void clickElement(By locator) {
        wait.untilClickable(locator).click();
    }

    protected void type(By locator, String text) {
        wait.untilClickable(locator).sendKeys(text);
    }
}
