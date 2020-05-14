package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class AddToCartPage extends HomePage{
    protected By btnAddToCart = By.id("product-addtocart-button");
    protected By lblItemPrice = By.id("//*[@id=\"product-price-326752\"]");
    protected By lblItemName = By.xpath("//*[@class=\"base\"]");
    protected By btnShoeSize = By.xpath("//*[@id=\"swatch-row-228\"]/div[7]");
    protected By btnDelivery = By.xpath("//*[@class=\"label shipping-label js-delivery-method title -delivery\"]");

    public void clickAddToCartButton(){
        syscoLabUI.click(btnAddToCart);
    }

    public String getItemPrice(){
        return syscoLabUI.getText(lblItemPrice);
    }

    public String getItemName(){
        return syscoLabUI.getText(lblItemName);
    }

    public void selectShoeSize(){
        syscoLabUI.waitTillElementLoaded(btnShoeSize);
        syscoLabUI.click(btnShoeSize);
    }
    public void selectDiliveryOption(){
        syscoLabUI.waitTillElementLoaded(btnDelivery);
        syscoLabUI.click(btnDelivery);
    }




}

