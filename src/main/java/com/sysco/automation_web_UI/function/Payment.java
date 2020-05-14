package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.PaymentPage;

public class Payment extends PaymentPage {
    static PaymentPage paymentPage = new PaymentPage();
    public static String VerifyNavigationOfPaymentPage(){
        return paymentPage.getPaymentHeader();
    }
}
