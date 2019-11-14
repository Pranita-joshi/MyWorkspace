package utils;

import java.io.IOException;
import java.util.Properties;

/*This class is used to read properties from property file*/

public class PropertyFileReader {

	private static Properties properties;
	private static PropertyFileReader propertyFileReader = new PropertyFileReader();

	public PropertyFileReader() {
		properties = new Properties();
		try {
			properties.load(PropertyFileReader.class.getClassLoader().getResourceAsStream("application.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getDriverPath() {
		String driverPath = properties.getProperty("driver.path");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("Driver path is not specified in application.properties");
	}

	public String getBrowser() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("Browser value not specified in application.properties");
	}

	public String getApplicationUrl() {
		String applicationUrl = properties.getProperty("app.url");
		if (applicationUrl != null)
			return applicationUrl;
		else
			throw new RuntimeException("Application URL is not specified in application.properties");
	}

	public long getImplicitWait() {
		String implicitWait = properties.getProperty("implicitlyWait");
		if (implicitWait != null) {
			try {
				return Long.parseLong(implicitWait);
			} catch (NumberFormatException e) {
				throw new RuntimeException("Not able to parse value" + implicitWait + "into Long");
			}
		}
		return 30;
	}

	public long getPageLoadTime() {
		String pageLoadTime = properties.getProperty("pageLoadTime");
		if (pageLoadTime != null) {
			try {
				return Long.parseLong(pageLoadTime);
			} catch (NumberFormatException e) {
				throw new RuntimeException("Not able to parse value " + pageLoadTime + " into Long");
			}
		}
		return 60;
	}

}
