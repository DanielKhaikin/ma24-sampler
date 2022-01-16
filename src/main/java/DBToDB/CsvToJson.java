package DBToDB;

import Parsers.MadaReport;
import Readers.CsvReader;
import Writers.JsonWriter;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;

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
        CsvReader csvReader = new CsvReader(csvFile);
        JsonWriter jsonWriter = new JsonWriter(jsonFile);
        LinkedList<MadaReport> list = new LinkedList<>();
        int count = 0;
        int numFiles = 1;
        HashSet<MadaReport> madaReports = (HashSet<MadaReport>) csvReader.readData();
        for (MadaReport madaReport: madaReports) {
            list.add(madaReport);
            count++;
            if ((count == 50000) || count == madaReports.size()){
                jsonWriter.writeData(list);
                numFiles++;
                File newFile = new File("C:\\Users\\Daniel\\HadogemHamatmidJson\\file%d.json", String.valueOf((numFiles)));
                jsonWriter.setFile(newFile);
                list.clear();
            }
        }
    }
}
