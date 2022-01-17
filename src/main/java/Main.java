
import DBToDB.CsvToXml;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File csvfile = new File("C:\\Users\\Daniel\\HaDogemHaMatmod\\src\\main\\resources\\LabTests.csv");
        File xmlFile = new File("C:\\Users\\Daniel\\LABTESTS\\file1.xml");
        CsvToXml csvToXml = new CsvToXml(csvfile, xmlFile);
        csvToXml.execute();
        System.out.println("finished");
    }
}
