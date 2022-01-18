package DBToDB;

import Parsers.CrossedData;
import Parsers.LabTest;
import Parsers.MadaReport;
import Readers.CsvReader;
import Readers.CsvReaderB;
import Transforms.CrossDataFromCsv;
import Writers.JsonWriterC;

import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;

public class CrossedDataToJson implements DBToDB{

    private File csvFile1;
    private File csvFile2;
    private File jsonFile;

    public CrossedDataToJson(File csvFile1, File csvFile2, File jsonFile) {
        this.csvFile1 = csvFile1;
        this.csvFile2 = csvFile2;
        this.jsonFile = jsonFile;
    }

    @Override
    public void execute() {
        CsvReader csvReader = new CsvReader(csvFile1);
        CsvReaderB csvReaderB = new CsvReaderB(csvFile2);
        JsonWriterC jsonWriterC = new JsonWriterC(jsonFile);
        CrossDataFromCsv crossDataFromCsv = new CrossDataFromCsv();
        HashSet<MadaReport> madaReports = (HashSet<MadaReport>) csvReader.readData();
        HashSet<LabTest> labTests = (HashSet<LabTest>) csvReaderB.readData();
        HashSet<CrossedData> crossedData = crossDataFromCsv.crossData(labTests, madaReports);
        LinkedList<CrossedData> crossedDataLinkedList = new LinkedList<>();
        int count = 0;
        int numFiles = 1;
        String temp = null;
        for (CrossedData crossedData1 : crossedData){
            temp += crossedData1.toString();
            count++;
            if ((temp.getBytes().length > 19000000) || (crossedData.size() == count)){
                crossedDataLinkedList.add(crossedData1);
                jsonWriterC.writeData(crossedDataLinkedList);
                numFiles++;
                File newFile = new File("C:\\Users\\Daniel\\POSITIVE_CORONA_PEOPLE\\file1.json" , String.valueOf(numFiles));
                jsonWriterC.setFile(newFile);
                crossedDataLinkedList.clear();
                temp = null;
            }else{
                crossedDataLinkedList.add(crossedData1);
            }
        }
    }
}
