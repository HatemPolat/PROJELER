package tests.US005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Hatem_PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestBaseRaporUS567 extends TestBaseRapor {
    Hatem_PearlyMarketPage pearlyMarketPage = new Hatem_PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());
    @Test
public void testUS005() throws InterruptedException {
    extentTest=extentReports.createTest("Pozitif Test",
            "Store Manager olarak, Products a gidip yeni ürünler yükleyebilmeli");


        //Store Manager  https://pearlymarket.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarketUrl"));
        extentTest.info("pearlymarket  sitesine gidildi");

        //Store Manager Sign-in sekmesine tiklar
        pearlyMarketPage.signInButtongiris.click();
        extentTest.info("Sign-in sekmesine tiklanabildi");
        //Store Manager Username girer

        pearlyMarketPage.signIn_emailBox.sendKeys(ConfigReader.getProperty("validUserName"));
               // Store Manager Password girer
        pearlyMarketPage.signIn_passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        extentTest.info("Username ve Password dogru bir sekilde girildi");
        //Store Manager Sign-in butonuna tiklar
        pearlyMarketPage.signInButton2.click();
        extentTest.info("Sign-in sekmesine tiklanabildi");

        //Store Manager Myaccount sekmesine tiklar
        pearlyMarketPage.signout1.click();
        extentTest.info("Store Manager Myaccount sekmesine tiklandi");

        //Store Manager sekmesine tiklar
        pearlyMarketPage.storeManagerLogin.click();
        extentTest.info("Store Manager sekmesine tiklanabildi");
        //Store Manager Products sekmesine tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("Store Manager Products sekmesine tiklandi");
                pearlyMarketPage.products.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        ReusableMethods.waitFor(1);
        Assert.assertTrue(pearlyMarketPage.screen_status_stock_price.isDisplayed());
        extentTest.pass("Sayfaya basarili sekilde girildigi goruldu");
        //Store Manager Add New Product simgesine tiklar
        pearlyMarketPage.addNewButton.click();
        extentTest.pass("Store Manager Add New Product simgesine tiklandigi goruldu");
        //Store Manager urun icin virtual veya downloadable secenegi oldugunu gorur
        Assert.assertTrue(pearlyMarketPage.isVirtual.isDisplayed());
        Assert.assertTrue(pearlyMarketPage.downloadable.isDisplayed());
        extentTest.pass("Store Manager urun icin virtual veya downloadable secenegi oldugunu gorur");
        //product title text butonunun görünürlüğünü dogrular
        Assert.assertTrue(pearlyMarketPage.productType.isDisplayed());
        extentTest.pass("product title text butonunun görünürlüğü dogrulandi");
        //product title bilgi girer
        pearlyMarketPage.pro_Title.sendKeys("Philips XB9185/07 TriActive Ultra");
        extentTest.pass("product title bilgi girildi");
        //satis miktari butonunu gorunurlugunu dogrular
        Assert.assertTrue(pearlyMarketPage.salePricebox.isDisplayed());
        extentTest.pass("satis miktari butonunu gorunurlugu dogrulandi");
        //satis miktari bilgileri girilebilmeli
        pearlyMarketPage.salePricebox.sendKeys("360");
        pearlyMarketPage.regularPricebox.sendKeys("380");
        extentTest.pass("satis miktari bilgileri girilebildi");
        //add image resmine tıklar
        pearlyMarketPage.addfeaturedImageDisplay.click();
        extentTest.pass("add image resmine tıklandi");
              //bir fotograf seçer ve ekler
        pearlyMarketPage.pictureLibrary.click();
        pearlyMarketPage.Photo_1.click();
        pearlyMarketPage.selectButton.click();
        extentTest.pass("bir fotograf seçilip eklenebildi");
        //short description textinin gorunur oldugunu dogruladı
        Assert.assertTrue(pearlyMarketPage.short_DescriptionText.isDisplayed());
        extentTest.pass("short description textinin gorunur oldugunu dogruladı");
        //description textinin gorunur oldugunu dogruladı
        Assert.assertTrue(pearlyMarketPage.description.isDisplayed());
        extentTest.pass("description textinin gorunur oldugunu dogruladı");
        //short description textine girer ve bilgi girebilir
        Driver.getDriver().switchTo().frame(pearlyMarketPage.short_TextFrime);
        extentTest.pass("short description textine girildi ve bilgi girilebilindi");

        pearlyMarketPage.short_description_Text.sendKeys("Kaliteyi uygun fiyatla birlestirdik");
        Driver.getDriver().switchTo().defaultContent();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(10000);
        //description textine girer ve bilgi girebilir
        Driver.getDriver().switchTo().frame(pearlyMarketPage.description_TextiFrime);
        pearlyMarketPage.description_Text.sendKeys("Bu fiyata bu kalite kacmaz");
        Driver.getDriver().switchTo().defaultContent();
        extentTest.pass("description textine girildi ve bilgiler yazilabildi");
        actions.sendKeys(Keys.PAGE_UP).perform();

        //Store manager besin takviyelerini categories de oldugunu dogrular
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        Assert.assertTrue(pearlyMarketPage.besintakviyeleri.isDisplayed());
        extentTest.pass("Store manager besin takviyelerini categories de oldugunu dogrulandi");
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
            //Store manager besin takviyelerini categories altindaki listede tiklar
               pearlyMarketPage.besintakviyeleri.click();

        extentTest.pass("Store manager besin takviyelerini categories altindaki listede tiklandi");
        //Categories menusunun gorunur oldugunu dogrular
        Assert.assertTrue(pearlyMarketPage.categories.isDisplayed());
        extentTest.pass("Categories menusunun gorunur oldugunu dogrulandi");
        // Categories menusunden  best sellerin oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.bestSeller.isDisplayed());
        pearlyMarketPage.bestSeller.click();
        extentTest.pass("Categories menusunden  best sellerin oldugunu dogrulandi ve tiklandi");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        //Categories menusunden Elektrik & Elektronik kategorisinin oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.elektrik_Elektronik.isDisplayed());

        pearlyMarketPage.elektrik_Elektronik.click();
        extentTest.pass("Categories menusunden Elektrik &" +
                " Elektronik kategorisinin oldugunu dogrulandi ve tiklandi");
        //Categories menusunden  best sellerin oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.bestSeller.isDisplayed());
        extentTest.pass("Categories menusunden  best sellerin oldugunu dogrulandi ve tiklandi");
        //Categories menusunden  indirimli urunler  oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.indirimli_Urun.isDisplayed());
        pearlyMarketPage.yeniurunler.click();
        extentTest.pass("Categories menusunden  indirimli urunler  oldugunu dogrulandi ve tiklandi");
        //Categories menusunden   Books & Music & Film dogrular
        Assert.assertTrue(pearlyMarketPage.books__music_Film.isDisplayed());
        pearlyMarketPage.books__music_Film.click();
        extentTest.pass("Categories menusunden   Books & Music & Film dogrulandi");
        //Categories menusunden  Kozmetik & kisisel kategorisinin oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.cozmetic_personel.isDisplayed());
        pearlyMarketPage.cozmetic_personel.click();
        extentTest.pass("Categories menusunden  Kozmetik & kisisel " +
                "kategorisinin oldugunu dogrulandi ve tiklandi");
        //Categories menusunden  Moda & Giyim kategorisinin oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.facion_Clothes.isDisplayed());
        extentTest.pass("Categories menusunden  Moda & Giyim " +
                "kategorisinin oldugunu dogrulandi ve tiklandi");
        //Categories menusunden Toys&Games kategorisinin oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.toys_Games.isDisplayed());
        extentTest.pass("Categories menusunden  Toys&Games kategorisinin  oldugunu dogrulandi ve tiklandi");
        //Categories menusunden  Taki & aksesuar kategorisinin oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.accessories.isDisplayed());
        extentTest.pass("Categories menusunden  Taki & aksesuar kategorisinin  oldugunu dogrulandi ve tiklandi");
        //Categories menusunden  yeni urunler kategorisinin  oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.yeniurunler.isDisplayed());
        extentTest.pass("Categories menusunden  indirimli urunler  oldugunu dogrulandi ve tiklandi");
        //Product brands  menusunun gorunur oldugunu dogrular
        Assert.assertTrue(pearlyMarketPage.productsMenuBrand.isDisplayed());
        extentTest.pass("Categories menusunden yeni urunler kategorisinin  oldugunu dogrulandi ve tiklandi");
        //Product brands menusunden Elegant Auto group urununun brandinin  oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.elegant_Auto_Group.isDisplayed());
        pearlyMarketPage.elegant_Auto_Group.click();
        extentTest.pass("/Product brands menusunden Elegant Auto group " +
                "urununun brandinin  oldugunu dogrular ve tiklandi");
        //Product brands menusunden  Green Grass urununun brandinin  oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.green_Grass.isDisplayed());
        pearlyMarketPage.green_Grass.click();
        extentTest.pass("Product brands menusunden  Green Grass urununun brandinin  oldugunu dogrular ve tiklandi");
        //Product brands menusunden NodeJS urununun brandinin  oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.node_JS.isDisplayed());
        pearlyMarketPage.node_JS.click();
        extentTest.pass("Product brands menusunden NodeJS urununun brandinin  oldugunu dogrular ve tiklandi");
        //Product brands menusunden NSB urununun brandinin  oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.n_NSB.isDisplayed());
        pearlyMarketPage.n_NSB.click();
        extentTest.pass("Product brands menusunden NSB urununun brandinin  oldugunu dogrular ve tiklandi");
        //Product brands menusunden  RED urununun brandinin  oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.r_RED.isDisplayed());
        pearlyMarketPage.r_RED.click();
        extentTest.pass("Product brands menusunden  RED urununun brandinin  oldugunu dogrular ve tiklandi");
        //Product brands menusunden  SkySuite Tech urununun brandinin  oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.skySuite_Tech.isDisplayed());
        pearlyMarketPage.skySuite_Tech.click();
        extentTest.pass("Product brands menusunden  SkySuite Tech" +
                " urununun brandinin  oldugunu dogrular ve tiklandi");
        //Product brands menusunden  Sterling urunun brandinin  oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.sterling.isDisplayed());
        pearlyMarketPage.sterling.click();
        extentTest.pass("Product brands menusunden  Sterling urunun brandinin  oldugunu dogrular ve tiklar");






    }

}
