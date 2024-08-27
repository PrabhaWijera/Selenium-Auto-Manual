package testcase01_session21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingFirst {
	public static void main() {
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
