package com.testUtil_demo.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utiliti {
	
	public static long page_load_Timeout = 40;
	public static long implicitly_Wait = 40;
	
	
	
	public static void takescreenshot(WebDriver driver, String screenshot) {
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String correntDIR = System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(srcfile, new File(correntDIR+"/Screenshot/"+screenshot+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
