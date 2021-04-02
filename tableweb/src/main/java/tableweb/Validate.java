package tableweb;

import java.util.List;

public class Validate {
	
	public void test()
	{
		Webtables table = new Webtables();
		spreadsheet spread = new spreadsheet();
	List a =spread.sheetData;
     List b =table.webdata;

	boolean bol=a.equals(b);
	System.out.println("it is "+bol);
	
	}	

}
