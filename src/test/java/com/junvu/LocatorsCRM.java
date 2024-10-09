package com.junvu;

public class LocatorsCRM {

    //Xpath tương đối cách 1 đến 5
    //Login page
    public static String headerLogin = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String alertErrorMessage = "//div[@id='alerts']/div"; //Wrong ID or password
    public static String alertDangerMes1 = "//div[(contains(@class,'alert-danger')) and (normalize-space()='The Password field is required.')]"; // Password is empty
    public static String alertDangerMes2 = "//div[starts-with(@class,'alert alert-danger') and (normalize-space()='The Email Address field is required.')]"; // Email address is empty


    //Customer page
    public static String menuCustomer = "//li[(@class='menu-item-customers active') and (normalize-space()='Customers')]";
    public static String headerCustomer = "//span[normalize-space()='Customers Summary']";
    public static String searchBox = "//input[(@id='search_input')]";
    public static String buttonSearch = "//i[(@class='fa fa-search')]";
    public static String buttonNewCustomer = "//a[(@href='https://crm.anhtester.com/admin/clients/client') and (normalize-space()='New Customer')]";
    public static String buttonImportCustomers = "";


    //Đang ở đây
    //New Customer


    //Xpath tương đối cách 6 đến 10

    //Projects page

    // New Project


    //Dashboard page
    //Hàm wait for element visible: xác định element hiển thị đầy đủ
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";
    public static String menuCustomers = "//span[normalize-space()='Customers']";
    public static String iconProfile = "//li[contains(@class,'header-user-profile')]";

    public static String totalInvoicesAwaitingPayment = "(//span[normalize-space()='Invoices Awaiting Payment']/parent::div)/following-sibling::span";
    public static String totalConvertedLeads = "(//span[normalize-space()='Converted Leads']/parent::div)/following-sibling::span";
    public static String totalProjectsInProgress = "(//span[normalize-space()='Projects In Progress']/parent::div)/following-sibling::span";
    public static String totalTasksNotFinished = "(//span[normalize-space()='Tasks Not Finished']/parent::div)/following-sibling::span";


}
