package Session23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSelector {

    public static void main(String[] args) {


        // 1 ->>  import Web driver

        WebDriver driver =new ChromeDriver();

        // 2 ->>> put link in driver.get()
        driver.get("https://fitzky.com/");


        // 3 ->> large screen
        driver.manage().window().maximize();

        ///// TAG + ID


        // this is Tag and ID combination
        // get tag name and id value from Search bar CSS selector and pass the value to search bar

       // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirt");


        // We can use it Without TagName but it need apply css syntax

      ///  driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt");




        // TAG + .CLASS

        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirt");

        // so y can use with out Tag name but need it css syntax

        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");

        // double quatos inside
        driver.findElement(By.cssSelector("placeholder=\"Search store\""));


        // single quatos
        driver.findElement(By.cssSelector("placeholder='Search store'"));


        // and attribute with valule
        driver.findElement(By.cssSelector("input[placeholder='Search store']"));
        // or we can use thi with out attributee
        driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T shirt");


        // tag class attribute
            driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");


    }
}
