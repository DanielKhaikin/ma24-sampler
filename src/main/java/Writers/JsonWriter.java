package Writers;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class JsonWriter implements Writer{
    private File file;

    @Override
    public void writeData(LinkedList list) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(file, list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
