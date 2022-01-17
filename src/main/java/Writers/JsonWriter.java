package Writers;

import Parsers.MadaReport;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class JsonWriter implements Writer{
    private File file;

    public JsonWriter(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void writeData(LinkedList t) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(file, t);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
