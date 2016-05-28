
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MyFirstTest {
	
	@Test
	public void JustStartIt()
	{
		System.out.println("Let me learn");
		List<WebElement> lst = new ArrayList<WebElement>(); 
		
		Object []bj = new Object[2];
		for(Object j:bj)
		{
			System.out.println(j.toString());
		}
	}
   
}
