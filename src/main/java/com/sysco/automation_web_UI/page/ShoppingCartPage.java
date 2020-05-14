package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class ShoppingCartPage extends HomePage{
    protected By lblCartCount = By.xpath("//*[@class=\"counter qty\"]/span");
    protected By btnCart = By.xpath("//*[@class=\"showcart-trigger header-sidebar-link -cart\"]");
    protected By btnRemoveCartItem = By.xpath("//*[@class=\"action delete\"]");
    protected By btnOk = By.xpath("//*[@class=\"action-primary action-accept button -secondary\"]");
    protected By lblItemName = By.xpath("//*[@class=\"alink -plain\"]");
    protected By lblItemPrice = By.xpath("//*[@class=\"minicart-price\"]/span[1]");
    protected By btnCheckout = By.xpath("//*[@class=\"block-content -buttons\"]/div/div/div/button");

    public boolean isAvailable(){
        return syscoLabUI.isDisplayed(lblCartCount);
    }

    public void clickCartButton(){
            while(isAvailable()){
                syscoLabUI.click(btnCart);
                syscoLabUI.click(btnRemoveCartItem);
                syscoLabUI.click(btnOk);
                syscoLabUI.sleep(5);
            }
    }

    public void clickShoppingCart(){
        syscoLabUI.waitTillElementLoaded(btnCart);
        syscoLabUI.click(btnCart);
    }

    public String getItemName(){
        syscoLabUI.waitTillElementLoaded(lblItemName);
        return syscoLabUI.getText(lblItemName);
    }

    public String getItemPrice(){
        syscoLabUI.waitTillElementLoaded(lblItemPrice);
        return syscoLabUI.getText(lblItemPrice);
    }

    public void clickCheckoutButton(){
        syscoLabUI.click(btnCheckout);
    }

}


