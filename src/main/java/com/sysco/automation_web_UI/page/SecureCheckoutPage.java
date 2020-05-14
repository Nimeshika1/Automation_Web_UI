package com.sysco.automation_web_UI.page;

import org.openqa.selenium.By;

public class SecureCheckoutPage extends HomePage {
    protected By btnContinue = By.xpath("//*[@class=\"opc-submit-step\"]/button");
    protected By lblErrorMessageFirstName = By.xpath("//*[@id=\"shipping-new-address-form\"]/div[1]/div/div/span");
    protected By lblErrorMessageLastName = By.xpath("//*[@id=\"shipping-new-address-form\"]/div[2]/div/div/span");
    protected By lblErrorMessageSuburb = By.xpath("//*[@id=\"shipping-new-address-form\"]/div[4]/div/div/span");
    protected By lblErrorMessageState = By.xpath("//*[@id=\"shipping-new-address-form\"]/div[5]/div/div/span");
    protected By lblErrorMessagePostCode = By.xpath("//*[@id=\"shipping-new-address-form\"]/div[7]/div/div/span");
    protected By lblErrorMessageStreet1 = By.xpath("//div[@name='shippingAddress.street.0']//div[@class='field-error mage-error']");
    protected By lblErrorMessagePhoneNumber = By.xpath("//*[@data-role=\"shippingAddress.telephone\"]/div[2]/div/div[2]/span");
    protected By txtFirstName = By.xpath("//*[@name=\"shippingAddress.firstname\"]/div/input");
    protected By txtLastName = By.xpath("//*[@name=\"shippingAddress.lastname\"]/div/input");
    protected By txtCompany = By.xpath("//*[@name=\"shippingAddress.company\"]/div/input");
    protected By txtStreetLine1 = By.xpath("//*[@name=\"shippingAddress.street.0\"]/div/input");
    protected By txtStreetLine2 = By.xpath("//*[@name=\"shippingAddress.street.1\"]/div/input");
    protected By txtSuburb = By.xpath("//*[@name=\"shippingAddress.city\"]/div/input");
    protected By txtPostCode = By.xpath("//*[@name=\"shippingAddress.postcode\"]/div/input");
    protected By txtPhoneNumber= By.xpath("//*[@name=\"shippingAddress.telephone\"]/div/div[2]/div/input");
    protected By drpdSubub = By.xpath("//*[@id='ui-id-1']/li/a");
    protected By btnAutorityToLeaveBtn = By.xpath("//*[@class=\"choice field\"]/input");
    protected By lblSelectOption = By.xpath("//*[@class=\"choice field\"]/input");

    public void clickContinueBtn(){
        syscoLabUI.waitTillElementLoaded(btnContinue);
        syscoLabUI.click(btnContinue);
    }

   public String getFirstNameErrorMessage(){
        syscoLabUI.waitTillElementLoaded(lblErrorMessageFirstName);
        return syscoLabUI.getText(lblErrorMessageFirstName);
   }

    public String getLastNameErrorMessage(){
        return syscoLabUI.getText(lblErrorMessageLastName);
    }

    public String getSuburbErrorMessage(){
        return syscoLabUI.getText(lblErrorMessageSuburb);
    }

    public String getStateErrorMessage(){
        return syscoLabUI.getText(lblErrorMessageState);
    }

    public String getPostCodeErrorMessage(){
        return syscoLabUI.getText(lblErrorMessagePostCode);
    }

    public String getStreetErrorMessage(){
        return syscoLabUI.getText(lblErrorMessageStreet1);
    }

    public String getPhoneErrorMessage(){
        return syscoLabUI.getText(lblErrorMessagePhoneNumber);
    }

    public void enterFName(String firstName){
        syscoLabUI.sendKeys(txtFirstName, firstName);
    }

    public void enterLName(String lastName){
        syscoLabUI.sendKeys(txtLastName, lastName);
    }

    public void enterCompany(String company){
        syscoLabUI.sendKeys(txtCompany, company);
    }

    public void enterStreetL1(String streetLine1){
        syscoLabUI.sendKeys(txtStreetLine1, streetLine1);
    }

    public void enterStreetL2(String streetLine2){
        syscoLabUI.sendKeys(txtStreetLine2, streetLine2);
    }

    public void enterSuburb(String suburb){
        syscoLabUI.sendKeys(txtSuburb, suburb);
        syscoLabUI.sleep(3);
        syscoLabUI.click(drpdSubub);
        syscoLabUI.sleep(3);
    }

    public void enterPostCode(String postcode){
        syscoLabUI.sendKeys(txtPostCode, postcode);
    }

    public void enterPNumber(String phoneNumber){
        syscoLabUI.sendKeys(txtPhoneNumber, phoneNumber);
    }

    public String getFName(){
        syscoLabUI.waitTillElementLoaded(txtLastName);
        return syscoLabUI.getText(txtFirstName);
    }

    public String getLName(){
        return syscoLabUI.getText(txtLastName);
    }

    public void clearFName(){
        syscoLabUI.clear(txtFirstName);
    }

    public void clearLName(){
        syscoLabUI.clear(txtLastName);
    }

    public void clickAutorityToLeaveBtn(){
        syscoLabUI.click(btnAutorityToLeaveBtn);
    }

    public void clickSelectOption(){
        syscoLabUI.click(lblSelectOption);
        syscoLabUI.sleep(3);
    }


}
