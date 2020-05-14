package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.ShoppingCartPage;

public class ShoppingCart extends ShoppingCartPage {
    static ShoppingCartPage cartPage = new ShoppingCartPage();

   public static void removeCartItems(){
       cartPage.clickCartButton();
   }

    public static void clickShoppingCartIcon(){
        cartPage.clickShoppingCart();
    }
    public static String getPriceOfItem(){
       return cartPage.getItemPrice();
    }
    public static String getNameOfItem(){
        return cartPage.getItemName();
    }
    public static void clickProceedCheckoutButton(){
       cartPage.clickCheckoutButton();
    }
}
