package com.sysco.automation_web_UI.util;
import com.sysco.automation_web_UI.function.Home;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    @BeforeClass
    public void init(){
        Home.navigateAthletesFootHomePage();
    }

    @AfterClass
    public void updateMethod(){
//        Home.quitTheDriver();
    }
}
