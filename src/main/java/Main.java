
import DBToDB.CrossedDataToJson;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File csvfile1 = new File("C:\\Users\\Daniel\\HaDogemHaMatmod\\src\\main\\resources\\LabTests.csv");
        File csvfile2 = new File("C:\\Users\\Daniel\\HaDogemHaMatmod\\src\\main\\resources\\MadaReports.csv");
        File jsonFile = new File("C:\\Users\\Daniel\\POSITIVE_CORONA_PEOPLE\\file1.json");
        CrossedDataToJson crossedDataToJson= new CrossedDataToJson(csvfile2, csvfile1, jsonFile);
        crossedDataToJson.execute();
        System.out.println("finished");
    }
}
