package tableweb;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {

	List webdata;
	public void Webtable(WebDriver driver) {
	WebElement webtable = (driver).findElement(By.xpath("//div[contains(@class,'ReactTable')]"));
	List webdata=new ArrayList();
	
	List<WebElement> rowsWithData = webtable.findElements(By.xpath("//div[contains(@class,'rt-td') and text()]/ancestor::div[contains(@class,'rt-tr-group')]"));
   
	int rowwithDatasize=rowsWithData.size();
    
	System.out.println("rowwithdatasizeis"+rowwithDatasize);
    
	for(int rowIndex =0; rowIndex<rowsWithData.size(); rowIndex++) {
    
		List<WebElement> colsWithData = rowsWithData.get(rowIndex).findElements(By.xpath(".//div[@class='rt-td'][text()]"));
		int size= colsWithData.size();
		System.out.println(""+size);
    
		for(int colIndex =0; colIndex<colsWithData.size(); colIndex++) {
    	
			String celldata=colsWithData.get(colIndex).getText();	
			webdata.add(celldata);
    }
    }
	
	
}

	
}

