package locators_session22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    public static void main(String[] args) {

        // 1  create web driver
        WebDriver driver =new ChromeDriver();

        //2 pass the url and open
        driver.get("https://demo.opencart.com/");

        // max screen browser screen
        driver.manage().window().maximize();

        //3 get target element  search bar name and pass the value for search bar
        // it auto worked
        driver.findElement(By.name("search")).sendKeys("Mac");

        // lets try element ID ex->i check logo is displayed or not
        boolean displayedLogo =driver.findElement(By.id("logo")).isDisplayed();
        System.out.println("🤖"+displayedLogo);



        // Link text and Partial LinkText
        // use iit

        // Link Text - y need to pass full value of link -> on cliking open target view


        //driver.findElement(By.linkText("Tablets")).click();

        // PartialLinkText
        // so if you need to call PartialLinkText , you no need to pass the complete value ("Tablets"). you cann portion value // full value ekna podi part ekk


       // driver.findElement(By.partialLinkText("Tab")).click();


        // it have some problem -> Whe i use partial link text ,
        // this macthh  with multiple web balance because we are not using the complete value, we are using some portion of the value.

        /// 31.18


        // Class and Tag Name Elements selectors

    List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));

        // rreturn total numbers of elementss
        System.out.println("Total no of list-inline-item: "+headerLinks.size());

        //TagName->  a =  anchor Tag
        List<WebElement>links=driver.findElements(By.tagName("a"));
        System.out.println("Anchor Tag count 🟩:"+links.size());

        // i need count how many img use by in this Web site
        List<WebElement> imgList =driver.findElements(By.tagName("img"));
        System.out.println("Image Count:"+imgList.size());



    }
}
