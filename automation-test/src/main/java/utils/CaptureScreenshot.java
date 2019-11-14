package utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

/*This class is used to Capture ScreenShots in case of Test Failure */
public class CaptureScreenshot {

	public static void afterScenario(Scenario scenario) {
		WebDriver driver = WebDriverManager.getDriver();
		System.out.println("Is Scenario failed" + scenario.isFailed());
		if (scenario.isFailed()) {
			File sceenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {
				Date date = new Date();
				DateFormat format = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
				FileUtils.copyFile(sceenshotFile,
						new File(System.getProperty("user.dir") + "\\img\\screenshot.png_" + format.format(date)));
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
