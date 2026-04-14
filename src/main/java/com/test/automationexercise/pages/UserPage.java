package com.test.automationexercise.pages;

import com.test.automationexercise.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage extends BasePage {

    private By loggedInText = By.xpath("//a[contains(text(),' Logged in as ')]");

    public UserPage(WebDriver driver) {
        super(driver);
    }

    public String getLoggedInText() {
        return wait.untilVisible(loggedInText).getText();
    }
}
