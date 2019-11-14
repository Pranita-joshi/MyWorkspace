package utils;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*Class contains driver related methods*/

public class WebDriverManager {

	private static WebDriverManager driverManager;

	private static WebDriver driver;
	private static String driverType;

	private final static String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	public static Properties properties = null;

	// Driver Instantiation
	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getPropertyReader().getBrowser();

		switch (driverType) {
		case "chrome":
			System.setProperty(CHROME_DRIVER_PROPERTY,
					FileReaderManager.getInstance().getPropertyReader().getDriverPath());
			driver = new ChromeDriver();
			break;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getPropertyReader().getImplicitWait(),
				TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(
				FileReaderManager.getInstance().getPropertyReader().getPageLoadTime(), TimeUnit.SECONDS);

	}

	// Launch Web Page
	public static void openPage() {
		System.out.println("Using Driver ======= " + driver);
		String url = FileReaderManager.getInstance().getPropertyReader().getApplicationUrl();
		System.out.println("Opening URL ====== " + url);
		driver.get(url);
	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static WebDriver setUpDriver() {

		if (driverManager == null)
			driverManager = new WebDriverManager();
		return driver;
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		driverManager = null;
	}

	public static void waitForPageToLoad() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static void waitForElementVisible() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
