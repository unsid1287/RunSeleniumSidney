package com.jamstop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Baby on 5/3/17.
 */
public class TestApplication {

    @Test (priority= 1 )

    public void doLoginUsername() {
        WebDriver dr = new ChromeDriver();
        System.out.println("Providing Username");

    }

    @Test (priority =2 )

    public void doLoginPassword() {

        System.out.println("Providing Password");
    }

    @Test (priority=3)

    public void doLogout() {

        System.out.println("Logging out");
}
@BeforeTest
    public void beforeTest(){

        System.out.println("Before executing test case");
}

@AfterTest
    public void afterTest(){

        System.out.println("After executing test case");

}
}