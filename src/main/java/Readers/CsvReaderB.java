package Readers;

import Parsers.LabTest;
import Parsers.MadaReport;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class CsvReaderB implements Reader{


    private File file;

    final static String DELIMITER = ",";

    public CsvReaderB(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public Set readData() {
        HashSet<LabTest> labTests = new HashSet<>();
        try {
            BufferedReader br = Files.newBufferedReader(Path.of(this.file.getAbsolutePath()));
            String line;
            while ((line = br.readLine()) != null){
                String[] record = line.split(DELIMITER);
                LabTest labTest = recordToLabTests(record);
                labTests.add(labTest);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return labTests;
    }

    public LabTest recordToLabTests(String[] record){
        String IDNum = record[0];
        String IDType = record[1];
        String  firstName= record[2];
        String lastName = record[3];
        String resultDate = record[4];
        String birthDate = record[5];
        String labCode = record[6];
        String stickerNumber = record[7];
        String resultTestCorona = record[8];
        String variant = record[9];
        String testType = record[10];
        String joinDate =
        return new LabTest(IDNum, IDType, firstName, lastName, resultDate, birthDate, labCode, stickerNumber, resultTestCorona, variant, testType, joinDate, healthCareID, healthCareName);
    }
}
