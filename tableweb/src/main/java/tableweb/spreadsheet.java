package tableweb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class spreadsheet
{
   
 List sheetData;
	public  spreadsheet() {
		 List sheetData = new ArrayList();
	    FileInputStream file=null;
    	try {
    		file = new FileInputStream("C:\\Users\\ram.pandi\\Desktop\\Webtable.xlsx");
    		}
    	catch (FileNotFoundException e) 
    	{
    		e.printStackTrace();
    		}   
	    XSSFWorkbook excelWorkBook=null;
		try {
			excelWorkBook = new XSSFWorkbook(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    XSSFSheet excelSheet = excelWorkBook.getSheet("Sheet1");
	    
	    
	    Iterator rows = excelSheet.rowIterator();
	    while (rows.hasNext()) {
	    XSSFRow row = (XSSFRow) rows.next();
	    Iterator cells = row.cellIterator();
	     
	    List data = new ArrayList();
	    while (cells.hasNext()) {
	    XSSFCell cell = (XSSFCell) cells.next();
	    data.add(cell);
	    }
	     
	    sheetData.add(data);
	    this.sheetData=sheetData;
	    }
        }
}
	   

  