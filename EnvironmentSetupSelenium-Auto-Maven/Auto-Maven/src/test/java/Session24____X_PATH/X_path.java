package Session24____X_PATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        driver.manage().window().maximize();

            //Relative XPATH with single attribute

       // driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Macbook");

        //Relative XPATH with Multiple attribute in same element

       // driver.findElement(By.xpath("//input[@name = 'search'][@placeholder='Search']")).sendKeys("Apple Lap");



        // X-PATH with 'and'  <--->   'or' Operators

            // AND

       // driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T shirts");

        //OR

       // driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("T shirts");

        // X-PATH with TEXT() - Inner text

        //driver.findElement(By.xpath("//a[text()='Canon EOS 5D']")).click();

        // if you dont know tag type

       // driver.findElement(By.xpath("//*[text()='MacBook']")).click();


        // Normal Inner Text we can print console
       // boolean feature =  driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
        //System.out.println("feature IS Displayed-> 🐞 "+feature);

        // get value from inner Text
      //  String textValueFeatured = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
       // System.out.println("Inner Text value :"+textValueFeatured);


        //  X-PATH with Contains()
        // input[contains(@placeholder,'Sear')]
        // driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("MacBook");


        // X-PATH with Starts-with()
       // driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T shirt");



        //Handling Dynamic Attribute Contains() & Starts-with()


      //  driver.findElement(By.xpath("//*[@id='start' or @id='stop']"));


        //contains + Dynamic
      //  driver.findElement(By.xpath("//*[contains(@id,'st')]"));


        //starts-with + Dynamic
      //  driver.findElement(By.xpath("//*[starts-with(@id,'st')]"));


            // Chained   XPATH

      boolean status =driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        System.out.println("X PATH CAin"+status);



        // Locating  Parent Element
        //ex:1
        driver.findElement(By.xpath("//input[@id='logo']/parent::div"));

        //ex:2
        driver.findElement(By.xpath("//input[@id='logo']/parent::*"));

        //ex:3
        driver.findElement(By.xpath("//input[@id='logo']/.."));


        //Locating Child Element

        //ex:1 -> div is self node
        driver.findElement(By.xpath("//div[@name='logoBox']/child::input"));

        //ex:::2
        driver.findElement(By.xpath("//div[@id='logoBox']/input"));


        //  Locating Grand Child

        //ex::1
        //form/*/input

        //ex::2
        //form/div/input



    //Locating Ancestors of a Known Element

        //ex1:::
        driver.findElement(By.xpath("//input[@id='txtUserName']/ancestor::form")); // wll select form element

        //ex2::::
        driver.findElement(By.xpath("//input[@id='txtUserName']/ancestor::*")); // div element wil be selected from the available
        // candidates[div,form,etc] as it comes first in the path you use find Element method.


        // Locating descendants of a  known element

        //ex: 1
        driver.findElement(By.xpath("//form[@id='formLogin']/descendant::input"));

        //ex:2
        driver.findElement(By.xpath("//form[@id='formLogin']//input"));



        // locating FOLLOWING  Elements

        //ex:::1
        driver.findElement(By.xpath("//input[@id='search']/following::input"));

        //ex:::2
        driver.findElement(By.xpath("//input[@id='search']/following::*"));


    }
}
