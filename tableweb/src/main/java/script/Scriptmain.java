package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import tableweb.Validate;
import tableweb.Webtables;

public class Scriptmain {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ram.pandi\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/webtables");
		  Webtables table=new Webtables();
		  table.Webtable(driver);
		  
		  Validate validate = new Validate();
		  validate.test();
	}

}
