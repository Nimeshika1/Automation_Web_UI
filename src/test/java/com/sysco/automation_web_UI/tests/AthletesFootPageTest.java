package com.sysco.automation_web_UI.tests;

import com.sysco.automation_web_UI.data.DashBoardData;
import com.sysco.automation_web_UI.data.LoginData;
import com.sysco.automation_web_UI.data.PaymentPageData;
import com.sysco.automation_web_UI.data.SecureCheckoutData;
import com.sysco.automation_web_UI.function.*;
import com.sysco.automation_web_UI.util.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AthletesFootPageTest extends TestBase {
    static LoginData loginData = new LoginData();
    static DashBoardData dashBoardData = new DashBoardData();
    static SecureCheckoutData secureCheckoutData = new SecureCheckoutData();
    static PaymentPageData paymentPageData = new PaymentPageData();
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1)
    public void verifyLoginButtonAvailability(){
        Assert.assertTrue(Home.isAvailabileLoginButton());
    }

    @Test(priority = 2)
    public void verifyLoginSection(){
        ShoppingCart.removeCartItems();
        Home.clickLoginButton();
        Login.enterLoginDetails(loginData.getValidEmail(), loginData.getInvalidPassword());
        Login.clickLoginButton();
        softAssert.assertEquals(Login.getErrorMessage(),loginData.getErrorMessage());

        Login.enterLoginDetails(loginData.getInvalidEmail(), loginData.getValidPassword());
        Login.clickLoginButton();
        softAssert.assertEquals(Login.getErrorMessage(),loginData.getErrorMessage());

        Login.enterLoginDetails(loginData.getInvalidEmail(), loginData.getInvalidPassword());
        Login.clickLoginButton();
        softAssert.assertEquals(Login.getErrorMessage(),loginData.getErrorMessage());

        Login.enterLoginDetails(loginData.getValidEmail(), loginData.getValidPassword());
        Login.clickLoginButton();
        softAssert.assertEquals(DashBoard.getUserData(),dashBoardData.getUserData());

    }

    @Test(priority = 3)
    public void verifyItemDetails(){
        Category.selectItemFromCategory();
        String productPrice = AddidasWoman.getProductPrice();
        String productName = AddidasWoman.getProductName();
        AddidasWoman.clickOnProduct();
        AddToCart.addItemToCart();
        TopContainer.shopAddedItemsToCart();
        ShoppingCart.clickShoppingCartIcon();
        softAssert.assertEquals(ShoppingCart.getNameOfItem(), productName);
        softAssert.assertEquals(ShoppingCart.getPriceOfItem(),productPrice);
    }

    @Test(priority = 4)
    public void VerifyCheckoutPageFirstNameLatName(){
        ShoppingCart.clickProceedCheckoutButton();
        softAssert.assertEquals(SecureCheckout.getFirstName(), secureCheckoutData.firstName);
        softAssert.assertEquals(SecureCheckout.getLastName(), secureCheckoutData.lastName);
    }

    @Test(priority = 5)
    public void VerifyContinueButtonFuntionality(){
        SecureCheckout.clearFirstName();
        SecureCheckout.clearLastName();
        SecureCheckout.clickContinueButton();
        softAssert.assertEquals(SecureCheckout.getErrorMessageWithoutFirstName(), secureCheckoutData.errorWithoutMandotoryFields);
        softAssert.assertEquals(SecureCheckout.getErrorMessageWithoutLastName(), secureCheckoutData.errorWithoutMandotoryFields);
        softAssert.assertEquals(SecureCheckout.getErrorMessageWithoutStreet(), secureCheckoutData.errorWithoutMandotoryFields);
        softAssert.assertEquals(SecureCheckout.getErrorMessageWithoutSuburb(), secureCheckoutData.errorWithoutMandotoryFields);
        softAssert.assertEquals(SecureCheckout.getErrorMessageWithoutState(), secureCheckoutData.errorWithoutMandotoryFields);
        softAssert.assertEquals(SecureCheckout.getErrorMessageWithoutPostCode(), secureCheckoutData.errorWithoutMandotoryFields);
        softAssert.assertEquals(SecureCheckout.getErrorMessageWithoutPhone(), secureCheckoutData.errorWithoutMandotoryFields);
    }

    @Test(priority = 6)
    public void VerifyPaymentDetails(){
        SecureCheckout.enterFirstName(secureCheckoutData.firstName);
        SecureCheckout.enterLastName(secureCheckoutData.lastName);
        SecureCheckout.enterCompanyName(secureCheckoutData.company);
        SecureCheckout.enterStreetLine1(secureCheckoutData.streetLine1);
        SecureCheckout.enterStreetLine2(secureCheckoutData.streetLine2);
        SecureCheckout.enterSuburbData(secureCheckoutData.suburb);
        SecureCheckout.enterPostalCode(secureCheckoutData.postalCode);
        SecureCheckout.enterPhoneNumber(secureCheckoutData.phoneNumber);
        SecureCheckout.selectAutorityToLeaveBtn();
        SecureCheckout.selectLeaveOption();
        SecureCheckout.clickContinueButton();
        softAssert.assertEquals(Payment.VerifyNavigationOfPaymentPage(),paymentPageData.paymentPageHeader);
    }


}
