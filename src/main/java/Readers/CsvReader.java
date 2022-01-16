package Readers;

import Parsers.MadaReport;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
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
            BufferedReader br = Files.newBufferedReader(Path.of(this.file.getPath()));
            String line;
            while ((line = br.readLine()) != null){
                String[] record = line.split(DELIMITER);

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
        String supplierCode = record[3];
        String firstName = record[4];
        String lastName = record[5];
        String city = record[6];
        String street = record[7];
        String buildingNumber = record[8];
        String barcode = record[9];
        String getDate = record[10];
        String takeDate = record[11];
        String resultDate = record[12];
        return new MadaReport(MDACODE,IDNum,IDType,supplierCode,firstName,lastName,city,street,buildingNumber,barcode,getDate,takeDate,resultDate);
    }


}
