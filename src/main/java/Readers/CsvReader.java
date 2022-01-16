package Readers;

import java.io.File;
import java.util.Set;

public class CsvReader implements Reader{

    private File file;

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
        return null;
    }
}
