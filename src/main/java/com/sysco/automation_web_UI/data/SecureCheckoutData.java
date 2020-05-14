package com.sysco.automation_web_UI.data;

public class SecureCheckoutData {
    public String email = "williamjacob802@gmail.com";
    public String firstName = "william";
    public String lastName = "Jacob";
    public String company = "ABC";
    public String streetLine1 = "main Road";
    public String streetLine2 = "Austin";
    public String suburb = "BARANGAROO";
    public String postalCode = "2000";
    public String phoneNumber = "111111111";
    public String errorWithoutMandotoryFields = "This is a required field.";

    public String getEmail(){
        return email;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCompany(){
        return company;
    }
    public String getStreetLine1(){
        return streetLine1;
    }
    public String getStreetLine2(){
        return streetLine2;
    }
    public String getPostalCode(){
        return postalCode;
    }
    public String getSuburb(){
        return suburb;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getErrorMessage(){
        return errorWithoutMandotoryFields;
    }

}
