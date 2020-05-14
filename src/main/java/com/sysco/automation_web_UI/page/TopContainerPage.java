package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class TopContainerPage extends HomePage{
    protected By btnShopNow = By.xpath("//*[@class=\"top-tri pink\"]/a");

    public void clickOnShopNowButton(){
        syscoLabUI.waitTillElementLoaded(btnShopNow);
        syscoLabUI.click(btnShopNow);
    }

}
