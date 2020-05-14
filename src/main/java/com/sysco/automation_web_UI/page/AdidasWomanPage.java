package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class AdidasWomanPage extends HomePage{

    protected By btnProduct1 = By.xpath("//*[@class=\"product-image-wrapper\"]/div/img");
    protected By lblPrice = By.xpath("//*[@id=\"product-price-326752\"]/span");
    protected By lblName = By.xpath("//*[@class=\"item product product-item sli_wrapper sli_col5\"][1]/div/div[3]/strong/a");

    public void clickProductOne(){
        syscoLabUI.waitTillElementLoaded(btnProduct1);
        syscoLabUI.click(btnProduct1);
    }

    public String getPrice(){
        syscoLabUI.waitTillElementLoaded(lblPrice);
        return syscoLabUI.getText(lblPrice);
    }

    public String getName(){
        return syscoLabUI.getText(lblName);
    }
}
