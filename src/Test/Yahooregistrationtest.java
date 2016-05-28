package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Yahooregistrationtest {
	
  @Test(dataProvider="DataForYahooRegistration")
  public void registerInYahoo(String Firstname,String LastName,String userName,String password) {
	  System.out.println(Firstname+"---"+LastName+"-----"+userName+"-------"+password);
  }
  
  @DataProvider
  public Object[][] DataForYahooRegistration()
  {
	  Object test[][] = new Object[3][4];
	  
	  //First row data
	  test[0][0] = "Steve";
	  test[0][1] = "Jobs";
	  test[0][2] = "Apple@";
	  test[0][3] = "I@AllDevices";
	  
	//Second row data
	  test[1][0] = "Bill";
	  test[1][1] = "Gates";
	  test[1][2] = "Microsoft@";
	  test[1][3] = "Window@AllSoftware";
	  
	//Third row data
	  test[2][0] = "Nicolas";
	  test[2][1] = "Tesla";
	  test[2][2] = "Tesla@";
	  test[2][3] = "Electric@AllCars";
	  
	  return test;
  }
}
