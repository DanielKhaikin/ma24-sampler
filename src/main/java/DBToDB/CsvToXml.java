package DBToDB;

import Parsers.MadaReport;
import Readers.CsvReader;
import Writers.JsonWriter;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;

public class CsvToXml implements DBToDB{
    private File csvFile;
    private File xmlFile;

    public CsvToXml(File csvFile, File xmlFile) {
        this.csvFile = csvFile;
        this.xmlFile = xmlFile;
    }

    public File getCsvFile() {
        return csvFile;
    }

    public void setCsvFile(File csvFile) {
        this.csvFile = csvFile;
    }

    public File getXmlFile() {
        return xmlFile;
    }

    public void setXmlFile(File xmlFile) {
        this.xmlFile = xmlFile;
    }

    public void execute() {
        CsvReader csvReader = new CsvReader(csvFile);
        JsonWriter jsonWriter = new JsonWriter(xmlFile);
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
