package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.TopContainerPage;

public class TopContainer extends TopContainerPage {
    static TopContainer topContainer = new TopContainer();

    public static void shopAddedItemsToCart(){
        topContainer.clickOnShopNowButton();
    }
}
