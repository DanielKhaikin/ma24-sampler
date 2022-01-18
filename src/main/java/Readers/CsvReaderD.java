package Readers;

import Parsers.LabTestSerology;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class CsvReaderD implements Reader{
    private File file;

    final static String DELIMITER = ",";

    public CsvReaderD(File file) {
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
        HashSet<LabTestSerology> labTestsSerology = new HashSet<>();
        try {
            BufferedReader br = Files.newBufferedReader(Path.of(this.file.getAbsolutePath()));
            String line = br.readLine();
            int count = 1;
            while ((line = br.readLine()) != null){
                String[] record = line.split(DELIMITER);
                LabTestSerology labTestSerology = recordToLabTests(record);
                System.out.println("read " + count);
                count++;
                if (labTestSerology == null){
                    labTestsSerology.add(labTestSerology);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return labTestsSerology;
    }

    public LabTestSerology recordToLabTests(String[] record){
        for (String str: record){
            if (str == null){
                return null;
            }
        }
        String IDNum = record[0];
        int IDType = Integer.parseInt(record[1]);
        String  firstName= record[2];
        String lastName = record[3];
        Date resultDate = Date.parse(record[4]);
        Date birthDate = Date.parse(record[5]);
        String labCode = record[6];
        String stickerNumber = record[7];
        int antidotes = Integer.parseInt(record[8]);
        int kitNumber = Integer.parseInt(record[9]);
        if (((IDType == 0) && (IDNum.length() != 9))){
            return null;
        }
        if (!checkLabCode(labCode)){
            return null;
        }
        return new LabTestSerology(IDNum, IDType, firstName, lastName, resultDate, birthDate, labCode, stickerNumber, antidotes, kitNumber);
    }

    public boolean checkLabCode(String labCode){
        System.out.println(labCode.substring(0,2));
        System.out.println(labCode.substring(2,4));
        if (labCode.length() != 5){
            return false;
        }
        if (!(labCode.substring(0,2).matches("[0-9]+"))){
            return false;
        }
        if (labCode.substring(2,3).matches("[0-9]+")){
            return false;
        }
        if (labCode.substring(3,4).matches("[0-9]+")){
            return false;
        }
        if (!(labCode.substring(4).matches("[0-9]+"))){
            return false;
        }
        return true;
    }
}
