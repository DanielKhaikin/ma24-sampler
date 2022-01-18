
import DBToDB.CrossedDataToJson;
import Readers.CsvReaderD;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File csvfile = new File("C:\\Users\\Daniel\\HaDogemHaMatmod\\src\\main\\resources\\Serology.csv");
        CsvReaderD csvReaderD = new CsvReaderD(csvfile);
        System.out.println(csvReaderD.checkLabCode("11ddf"));
        System.out.println("finished");
    }
}
