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
    public static String searchBoxHeader = "//input[(@id='search_input')]";
    public static String headerCustomer = "//span[normalize-space()='Customers Summary']";
    public static String totalCustomers = "//span[(contains(@class,'tw-truncate')) and (normalize-space()='Total Customers')]";
    public static String activeCustomers = "//span[(contains(@class,'tw-truncate')) and (normalize-space()='Active Customers')]";
    public static String inactiveCustomers = "//span[(contains(@class,'tw-truncate')) and (normalize-space()='Inactive Customers')]";
    public static String activeContacts = "//span[(contains(@class,'tw-truncate')) and (normalize-space()='Active Contacts')]";
    public static String inactiveContacts = "//span[(contains(@class,'tw-truncate')) and (normalize-space()='Inactive Contacts')]";
    public static String contactLoggedInToday = "//span[(contains(@class,'tw-truncate')) and (normalize-space()='Contacts Logged In Today')]";
    public static String buttonSearch = "//i[(@class='fa fa-search')]";
    public static String buttonNewCustomer = "//a[(@href='https://crm.anhtester.com/admin/clients/client') and (normalize-space()='New Customer')]";
    public static String buttonImportCustomers = "//a[(@href='https://crm.anhtester.com/admin/clients/import') and (normalize-space()='Import Customers')]";
    public static String buttonContacts = "//a[(@href='https://crm.anhtester.com/admin/clients/all_contacts') and (normalize-space()='Contacts')]";
    public static String iconFilters = "//i[@class='fa fa-filter']";
    public static String searchBox = "//input[(@type='search') and (@aria-controls='clients')]";
    public static String buttonExport = "//button[(@type='button') and (normalize-space()='Export')]";
    public static String buttonBurnActions = "//button[(@type='button') and (normalize-space()='Bulk Actions')]";
    public static String buttonRefresh = "//i[@class='fa fa-refresh']";

    //New Customer page
    public static String buttonQuickCreate = "//li[contains(@class,'icon tw-relative')]";
    public static String customerDetailstab = "//a[(@href='#contact_info') and (normalize-space()='Customer Details')]";
    public static String textboxCompany = "//input[(@type='text') and (@id='company')]";
    public static String textboxVATNumber = "//input[(@type='text') and (@id='vat')]";
    public static String textboxPhone = "//input[(@type='text') and (@id='phonenumber')]";
    public static String website = "//input[(@type='text') and (@id='website')]";
    public static String dropdownlistGroups = "//button[(@type='button') and (normalize-space()='Nothing selected') and (@aria-owns='bs-select-1')]";
    public static String buttonCreateNewGroup = "//a[@class='btn btn-default']";
    public static String dropdownlistCurrency = "//button[(@type='button') and (normalize-space()='System Default') and (@aria-owns='bs-select-2')]";
    public static String dropdownlistDefaultLang ="//button[(@type='button') and (normalize-space()='System Default') and (@aria-owns='bs-select-3')]";
    public static String textboxAddress = "//textarea[@id='address']";
    public static String textboxCity = "//input[(@type='text') and (@id='city')]";
    public static String textboxState = "//input[(@type='text') and (@id='state')]";
    public static String textboxZipCode ="//input[(@type='text') and (@id='zip')]";
    đang ở đây







    public static String billingAndShippingtab = "//a[(@href='#billing_and_shipping') and (normalize-space()='Billing & Shipping')]";


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
