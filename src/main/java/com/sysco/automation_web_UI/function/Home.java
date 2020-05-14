package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.HomePage;

public class Home{
    static HomePage homePage= new HomePage();

    public static void navigateAthletesFootHomePage(){
        homePage.openAthletesFootHomePage();
    }

    public static boolean isAvailabileLoginButton(){
       return homePage.isAvailabileLoginBtn();
    }

    public static void clickLoginButton(){
        homePage.clickLoginBtn();

    }

     public static void quitTheDriver(){
        homePage.quitDriver();
    }

}
