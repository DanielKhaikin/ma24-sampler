import DBToDB.CsvToJson;
import Parsers.MadaReport;
import Readers.CsvReader;

import java.io.File;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        File csvfile = new File("C:\\Users\\Daniel\\HaDogemHaMatmod\\src\\main\\resources\\MadaReports.csv");
        File jsonFile = new File("C:\\Users\\Daniel\\HadogemHamatmidJson\\file1.json");
        CsvToJson csvToJson = new CsvToJson(csvfile,jsonFile);
        csvToJson.execute();
        System.out.println("finished");
    }
}
