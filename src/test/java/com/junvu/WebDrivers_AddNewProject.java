package com.junvu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class WebDrivers_AddNewProject extends BaseTest {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo trình duyệt
        createDriver();

        //Log in vào CRM
        loginCRM();
        Thread.sleep(2000);

        //Click vào Project bên thanh taskbar bên trái
        driver.findElement(By.xpath(LocatorsCRM.menuProject)).click();
        Thread.sleep(1000);
        //Click vào button New Project
        driver.findElement(By.xpath(LocatorsCRM.buttonNewProject)).click();
        //Tạo 1 project mới
        driver.findElement(By.xpath(LocatorsCRM.textboxProjectName)).sendKeys("Automation with Selenium");
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistCustomer)).click();
        driver.findElement(By.xpath("//input[@aria-controls='bs-select-6']")).sendKeys("Công ty CP Sunshine Group");
        driver.findElement(By.xpath(LocatorsCRM.checkboxCalculate)).click();
        Thread.sleep(1000);
        boolean isSelected = driver.findElement(By.xpath(LocatorsCRM.checkboxCalculate)).isSelected();
        if (isSelected == false) {
            driver.findElement(By.xpath(LocatorsCRM.checkboxCalculate)).click();
        }
        //Scroll đến dropdown Billing Type
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(LocatorsCRM.dropdownlistbillingType)));
        driver.findElement(By.xpath(LocatorsCRM.dropdownlistbillingType)).click();
        Thread.sleep(1000);
        Select select = new Select(driver.findElement(By.xpath("//button[(@aria-owns='bs-select-1') and (@aria-expanded='true')]")));
        Thread.sleep(1000);
        select.selectByVisibleText("Fixed Rate");

        driver.findElement(By.xpath(LocatorsCRM.dropdownlistStatus)).click();
        Thread.sleep(1000);

        Select select2 = new Select(driver.findElement(By.xpath("//button[(@aria-owns='bs-select-2') and (@aria-expanded='true')]")));
        Thread.sleep(1000);
        select.selectByVisibleText("In Progress");

        driver.findElement(By.xpath(LocatorsCRM.textboxTotalRate)).sendKeys("75");
        driver.findElement(By.xpath(LocatorsCRM.textboxEstimatedHours)).sendKeys("150");

        //Đang ở đây Members dropdown list


        closeDriver();
    }
}
