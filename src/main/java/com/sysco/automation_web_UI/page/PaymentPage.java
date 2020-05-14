package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class PaymentPage extends HomePage{
    protected By lblPaymentHeader = By.xpath("//*[@id=\"co-payment-form\"]/fieldset/legend/span");

    public String getPaymentHeader(){
        syscoLabUI.waitTillElementLoaded(lblPaymentHeader);
        return syscoLabUI.getText(lblPaymentHeader);
    }
}
