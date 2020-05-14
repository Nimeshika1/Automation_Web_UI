package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.CategoryPage;

public class Category extends CategoryPage {
    static CategoryPage categoryPage = new CategoryPage();

    public static void selectItemFromCategory(){
        categoryPage.clickWomenCategory();
        categoryPage.clickItemAdidas();
    }

}
