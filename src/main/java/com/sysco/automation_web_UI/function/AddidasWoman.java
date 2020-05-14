package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.AdidasWomanPage;

public class AddidasWoman extends AdidasWomanPage {
    static AdidasWomanPage adidasWomanPage = new AdidasWomanPage();

    public static void clickOnProduct(){
        adidasWomanPage.clickProductOne();
    }
    public static String getProductName(){
        return adidasWomanPage.getName();
    }
    public static String getProductPrice(){
        return adidasWomanPage.getPrice();
    }


}
