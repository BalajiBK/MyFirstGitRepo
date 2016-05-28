package Test;

import org.testng.annotations.DataProvider;

//All data in one class
public class CommonData {
	
	@DataProvider(name="LoginInfo")
	public static Object[][] getLoginInfo()
	{
		Object dt[][] = new Object[1][2];
		
		dt[0][0]="FirstIntProv";
		dt[0][1]="Selenium@123";
		return dt;
	}

}
