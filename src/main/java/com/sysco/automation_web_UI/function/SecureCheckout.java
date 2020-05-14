package com.sysco.automation_web_UI.function;

import com.sysco.automation_web_UI.page.SecureCheckoutPage;

public class SecureCheckout extends SecureCheckoutPage {
    static SecureCheckout secureCheckout = new SecureCheckout();

    public static void clickContinueButton(){
        secureCheckout.clickContinueBtn();
    }

    public static String getErrorMessageWithoutFirstName(){
        return secureCheckout.getFirstNameErrorMessage();
    }

    public static String getErrorMessageWithoutLastName(){
        return secureCheckout.getLastNameErrorMessage();
    }

    public static String getErrorMessageWithoutState(){
        return secureCheckout.getStateErrorMessage();
    }

    public static String getErrorMessageWithoutSuburb(){
        return secureCheckout.getSuburbErrorMessage();
    }

    public static String getErrorMessageWithoutPostCode(){
        return secureCheckout.getPostCodeErrorMessage();
    }

    public static String getErrorMessageWithoutStreet(){
        return secureCheckout.getStreetErrorMessage();
    }

    public static String getErrorMessageWithoutPhone(){
        return secureCheckout.getPhoneErrorMessage();
    }

    public static void enterFirstName(String firstName){
        secureCheckout.enterFName(firstName);
    }

    public static void enterLastName(String lastName){
        secureCheckout.enterLName(lastName);
    }

    public static void enterCompanyName(String company){
        secureCheckout.enterCompany(company);
    }

    public static void enterStreetLine1(String streetLine1){
        secureCheckout.enterStreetL1(streetLine1);
    }

    public static void enterStreetLine2(String streetLine2){
        secureCheckout.enterStreetL2(streetLine2);
    }

    public static void enterSuburbData(String suburb){
        secureCheckout.enterSuburb(suburb);
    }

    public static void enterPostalCode(String postcode){
        secureCheckout.enterPostCode(postcode);
    }

    public static void enterPhoneNumber(String phoneNumber){
        secureCheckout.enterPNumber(phoneNumber);
    }

    public static String getFirstName(){
        return secureCheckout.getFName();
    }

    public static String getLastName(){
        return secureCheckout.getLName();
    }

    public static void clearFirstName(){
        secureCheckout.clearFName();
    }

    public static void clearLastName(){
        secureCheckout.clearLName();
    }

    public static void selectAutorityToLeaveBtn(){
        secureCheckout.clickAutorityToLeaveBtn();
    }
    public static void selectLeaveOption(){
        secureCheckout.clickSelectOption();
    }






}
