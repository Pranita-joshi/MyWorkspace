package utils;

/*Class is used as single point access to read files*/

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static PropertyFileReader propertyFileReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public PropertyFileReader getPropertyReader() {
		return (propertyFileReader == null) ? new PropertyFileReader() : propertyFileReader;

	}

}
