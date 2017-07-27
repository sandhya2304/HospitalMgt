package pack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	public static void capture(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot shot=(TakesScreenshot)driver;
		
		File src=shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./Screnshot/"+name+".png"));
		
	}
	
	

}
