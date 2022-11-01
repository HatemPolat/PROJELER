package tests.US005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Hatem_PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase02 {


    Hatem_PearlyMarketPage pearlyMarketPage = new Hatem_PearlyMarketPage();

    @Test
    public void test(){
        Actions actions = new Actions(Driver.getDriver());
        //Store Manager  https://pearlymarket.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarketUrl"));

        //Store Manager Sign-in sekmesine tiklar
        pearlyMarketPage.signInButtongiris.click();
        //Store Manager Username girer
        pearlyMarketPage.signIn_emailBox.sendKeys(ConfigReader.getProperty("validUserName"));

        // Store Manager Password girer
        pearlyMarketPage.signIn_passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        //Store Manager Sign-in butonuna tiklar
        pearlyMarketPage.signInButton2.click();
        //Store Manager Myaccount sekmesine tiklar
        pearlyMarketPage.signout1.click();
        //Store Manager sekmesine tiklar
        pearlyMarketPage.storeManagerLogin.click();
        //Store Manager Products sekmesine tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        pearlyMarketPage.products.click();

        //Store Manager Add New Product simgesine tiklar
        pearlyMarketPage.addNewButton.click();
        //Store Manager urun icin virtual veya downloadable secenegi oldugunu gorur
        Assert.assertTrue(pearlyMarketPage.isVirtual.isDisplayed());
        Assert.assertTrue(pearlyMarketPage.downloadable.isDisplayed());

        


    }
}
