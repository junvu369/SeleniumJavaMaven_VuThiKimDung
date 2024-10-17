package com.junvu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class WebElement extends BaseTest {
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
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-2-1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistDefaultLang)).click();
        driver.findElement(By.xpath("//li/a[@id='bs-select-3-1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[@for='default_language']")).click();

        driver.findElement(By.xpath(LocatorsCRM.textboxAddress)).sendKeys("Số nhà 123, đường Đại La");
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
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.buttonSaveC)).click();
        Thread.sleep(3000);

        System.out.println("Create new customer successfully");

        //Đóng trình truyệt
        closeDriver();
    }
}
//Đang lỗi