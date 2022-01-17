import DBToDB.CsvToJson;
import Parsers.LabTest;
import Parsers.MadaReport;
import Readers.CsvReader;
import Readers.CsvReaderB;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        File csvfile = new File("C:\\Users\\Daniel\\HaDogemHaMatmod\\src\\main\\resources\\MadaReports.csv");
        File jsonFile = new File("C:\\Users\\Daniel\\HadogemHamatmidJson\\file2.json");
        CsvToJson csvToJson = new CsvToJson(csvfile,jsonFile);
        csvToJson.execute();
        System.out.println("finished");
    }
}
