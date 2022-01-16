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

    publ


}
