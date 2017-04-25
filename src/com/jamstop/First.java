package com.jamstop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mkale9 on 4/22/17.
 */
public class First {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("www.thejamstop.com");
    }
}
