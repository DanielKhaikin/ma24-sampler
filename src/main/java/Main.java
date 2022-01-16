import Parsers.MadaReport;
import Readers.CsvReader;

import java.io.File;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Daniel\\HaDogemHaMatmod\\src\\main\\resources\\MadaReports.csv");
        CsvReader csvReader = new CsvReader(file);
        HashSet<MadaReport> madaReports = (HashSet<MadaReport>) csvReader.readData();
        System.out.println(madaReports.size());
    }
}
