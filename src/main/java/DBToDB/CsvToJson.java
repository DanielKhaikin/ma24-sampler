package DBToDB;

import java.io.File;

public class CsvToJson implements DBToDB{
    private File csvFile;
    private File jsonFile;

    public CsvToJson(File csvFile, File jsonFile) {
        this.csvFile = csvFile;
        this.jsonFile = jsonFile;
    }

    public File getCsvFile() {
        return csvFile;
    }

    public void setCsvFile(File csvFile) {
        this.csvFile = csvFile;
    }

    public File getJsonFile() {
        return jsonFile;
    }

    public void setJsonFile(File jsonFile) {
        this.jsonFile = jsonFile;
    }

    @Override
    public void execute() {
        
    }
}
