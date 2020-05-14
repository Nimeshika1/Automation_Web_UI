package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class CategoryPage extends HomePage{
    protected By btnWoman = By.xpath("//*[@class=\"page-header\"]/div[2]/nav/ul/li[1]");
    protected By btnItemAdidas = By.xpath("//*[@id=\"mi-3-1-2-1\"]");

    public void clickWomenCategory(){
        syscoLabUI.click(btnWoman);
        syscoLabUI.waitTillElementLoaded(btnWoman);
    }
    public void clickItemAdidas(){
        syscoLabUI.scrollToElement(btnItemAdidas);
        syscoLabUI.click(btnItemAdidas);
    }
}
