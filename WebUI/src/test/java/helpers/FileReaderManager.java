package helpers;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static DealerConfigFileReader dealerConfigFileReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public DealerConfigFileReader getDealerConfigFileReader(String environment) {
        return (dealerConfigFileReader == null) ? new DealerConfigFileReader(environment) : dealerConfigFileReader;
    }
}
