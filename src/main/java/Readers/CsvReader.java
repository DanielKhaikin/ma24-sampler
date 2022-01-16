package Readers;

import Parsers.MadaReport;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CsvReader implements Reader{

    private File file;

    final static String DELIMITER = ",";

    public CsvReader(File file) {
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
        HashSet<MadaReport> madaReports = new HashSet<>();
        try {
            BufferedReader br = Files.newBufferedReader(Path.of(this.file.getAbsolutePath()));
            String line;
            while ((line = br.readLine()) != null){
                String[] record = line.split(DELIMITER);
                MadaReport madaReport = recordToMadaReport(record);
                madaReports.add(madaReport);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return madaReports;
    }

    public MadaReport recordToMadaReport(String[] record){
        String MDACODE = record[0];
        String IDNum = record[1];
        String IDType = record[2];
        String firstName = record[3];
        String lastName = record[4];
        String city = record[5];
        String street = record[6];
        String buildingNumber = record[7];
        String barcode = record[8];
        String getDate = record[9];
        String takeDate = record[10];
        String resultDate = record[11];
        return new MadaReport(MDACODE,IDNum,IDType,firstName,lastName,city,street,buildingNumber,barcode,getDate,takeDate,resultDate);
    }


}
