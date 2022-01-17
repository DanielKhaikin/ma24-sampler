package DBToDB;

import Parsers.LabTest;
import Parsers.MadaReport;
import Readers.CsvReader;
import Readers.CsvReaderB;
import Writers.JsonWriter;
import Writers.XmlWriter;

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
        CsvReaderB csvReader = new CsvReaderB(csvFile);
        XmlWriter xmlWriter = new XmlWriter(xmlFile);
        LinkedList<LabTest> list = new LinkedList<>();
        int count = 0;
        int numFiles = 1;
        HashSet<LabTest> labTests = (HashSet<LabTest>) csvReader.readData();
        for (LabTest labTest: labTests) {
            list.add(labTest);
            count++;
            if ((count == 50000) || count == labTests.size()){
                xmlWriter.writeData(list);
                numFiles++;
                File newFile = new File("C:\\Users\\Daniel\\LABTESTS\\file%d.xml", String.valueOf((numFiles)));
                xmlWriter.setFile(newFile);
                list.clear();
            }
        }
    }
}
