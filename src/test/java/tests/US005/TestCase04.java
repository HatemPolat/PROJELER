package tests.US005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Hatem_PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase04 {
    Hatem_PearlyMarketPage pearlyMarketPage = new Hatem_PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test(){
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
        pearlyMarketPage.products.click();
    //Store Manager Add New Product simgesine tiklar
        pearlyMarketPage.addNewButton.click();
    //product title text butonunun görünürlüğünü dogrular
        Assert.assertTrue(pearlyMarketPage.productType.isDisplayed());
    //product title bilgi girer
        pearlyMarketPage.pro_Title.sendKeys("Philips XB9185/07 TriActive Ultra");
    //satis miktari butonunu gorunurlugunu dogrular
            Assert.assertTrue(pearlyMarketPage.salePricebox.isDisplayed());
    //satis miktari bilgileri girilebilmeli
        pearlyMarketPage.salePricebox.sendKeys("360");
        pearlyMarketPage.regularPricebox.sendKeys("380");
        //add image resmine tıklar
        pearlyMarketPage.addfeaturedImageDisplay.click();
        //dosya aç seçeneğini seçer
        //bir fotograf seçer ve ekler
        pearlyMarketPage.pictureLibrary.click();
        pearlyMarketPage.Photo_1.click();
        pearlyMarketPage.selectButton.click();





}
}
