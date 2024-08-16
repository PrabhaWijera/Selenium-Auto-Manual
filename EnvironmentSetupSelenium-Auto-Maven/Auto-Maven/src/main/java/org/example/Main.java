package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Test Case 01
 ---------
 1] Launch browser (chorme)
 2] Open URL https://demo.Opencart.com/
 3]  Validate title should be "Your store"
 4] Close browser
 */
public class Main {
    public static void main(String[] args) {

      //  1] Launch browser (chorme)
       // ChromeDriver driver=new ChromeDriver();

        WebDriver driver =new ChromeDriver();

        // 2] Open URL https://demo.Opencart.com/
        // pass the url get parameter
        driver.get("https://demo.opencart.com/");


        // 3]  Validate title should be "Your store"
        //capture the actual title
       String act_title = driver.getTitle();

       if(act_title.equals("Your Store")){
           System.out.println("Test Passed 🟩");
       }else{
           System.out.println("Test Failed 🔴");
       }

        //4] Close browser
      //  driver.close(); || driver.quit();
        driver.quit();
    }
}