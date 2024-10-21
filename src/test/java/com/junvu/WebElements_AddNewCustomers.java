package com.junvu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class WebElements_AddNewCustomers extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo trình duyệt
        createDriver();

        //Log in vào CRM
        loginCRM();
        Thread.sleep(2000);

        //Click vào Customers bên thanh taskbar bên trái
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.buttonNewCustomer)).click();
        Thread.sleep(1000);

        //Add New Customers
        driver.findElement(By.xpath(LocatorsCRM.textboxCompany)).sendKeys("Công ty CP Sunshine Group");
        driver.findElement(By.xpath(LocatorsCRM.textboxVATNumber)).sendKeys("012200111");
        driver.findElement(By.xpath(LocatorsCRM.textboxPhone)).sendKeys("0123456789");
        driver.findElement(By.xpath(LocatorsCRM.website)).sendKeys("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistGroups)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='bs-searchbox']/input[@aria-controls='bs-select-1']")).sendKeys("VIP");
        driver.findElement(By.xpath("//a[@id='bs-select-1-9' and normalize-space()='VIP']")).click();
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistGroups)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistCurrency)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='bs-searchbox']/input[@aria-controls='bs-select-2']")).sendKeys("USD");
        driver.findElement(By.xpath("//a[@id='bs-select-2-1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistDefaultLang)).click();
        driver.findElement(By.xpath("//option[@value='vietnamese']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='default_language']")).click();

        //Scroll đến element
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//label[@for='city']")));

        driver.findElement(By.xpath(LocatorsCRM.textboxAddress)).sendKeys("Số nhà 123, đường Nguyễn Du");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.textboxCity)).sendKeys("Hà Nội");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.textboxState)).sendKeys("Hai Bà Trưng");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.textboxZipCode)).sendKeys("000084");
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='form-group']/label[@for='country']/following-sibling::div/descendant::a[@id='bs-select-4-243']")).sendKeys("Vietnam");
        driver.findElement(By.xpath("//a[@id='bs-select-4-243']")).click();

        //Scroll lên đầu trang
        Thread.sleep(2000);
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(LocatorsCRM.tabbillingAndShipping)));

        //Nhập thông tin phần Billing Address
        driver.findElement(By.xpath(LocatorsCRM.tabbillingAndShipping)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.textboxBillingStreet)).sendKeys("Nguyễn Du");
        driver.findElement(By.xpath(LocatorsCRM.textboxBillingCity)).sendKeys("Hà Nội");
        driver.findElement(By.xpath(LocatorsCRM.textboxBillingState)).sendKeys("Hai Bà Trưng");
        driver.findElement(By.xpath(LocatorsCRM.textboxBillingZipCode)).sendKeys("000084");
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistBillingCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-controls='bs-select-5']")).sendKeys("Vietnam");
        driver.findElement(By.xpath("//a[@id='bs-select-5-243']/child::span[normalize-space()='Vietnam']")).click();
        Thread.sleep(1000);
        
        //Nhập thông tin phần Shipping Address
        driver.findElement(By.xpath(LocatorsCRM.textboxShippingStreet)).sendKeys("Vũ Tông Phan");
        driver.findElement(By.xpath(LocatorsCRM.textboxShippingCity)).sendKeys("Hà Nội");
        driver.findElement(By.xpath(LocatorsCRM.textboxShippingState)).sendKeys("Thanh Xuân");
        driver.findElement(By.xpath(LocatorsCRM.textboxShippingZipCode)).sendKeys("000084");
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistShippingCountry)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@aria-controls='bs-select-6']")).sendKeys("Vietnam");
        driver.findElement(By.xpath("//a[@id='bs-select-6-243']/child::span[normalize-space()='Vietnam']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.buttonSaveC)).click();
        Thread.sleep(3000);

        System.out.println("Create a new customer successfully");

        //Đóng trình truyệt
        closeDriver();
    }
}